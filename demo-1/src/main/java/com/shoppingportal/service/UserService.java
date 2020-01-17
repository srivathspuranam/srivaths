package com.shoppingportal.service;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.dom4j.util.UserDataAttribute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.shoppingcart.DAO.ProductRepository;
import com.shoppingcart.DAO.UserRepository;
import com.shoppingportal.model.ProductBean;
import com.shoppingportal.model.UserBean;

@Service
public class UserService {

	@Autowired
	ProductRepository pr;

	@Autowired
	UserRepository ur;

	public void save(UserBean ub) {
		ur.save(ub);
	}

	public void delete(String name) {
		ur.deleteByName(name);
	}

	public List<ProductBean> getAll() {
		List<ProductBean> products = pr.findAll();
		return getAll();
	}

	public ModelAndView login(String name, String password, ModelAndView model, HttpSession session) {
		UserBean user = ur.findByNameAndPassword(name, password);
		session.setAttribute("User", user);
		session.setMaxInactiveInterval(50);
		if (user != null) {
			model.setViewName("dashboard");
		} else {
			model.setViewName("login");
			model.addObject("message", "Username or Password is incorrect, Please try again");
		}
		return model;
	}
	
	public ModelAndView logout(ModelAndView model, HttpServletRequest request) {
		model.setViewName("login");
		HttpSession session = request.getSession(false);
		if(session == null) {
		session.invalidate();
		model.addObject("message", "You are successfully logged out");
		}else {
			model.addObject("message","login again");
		}
		return model;
	}


	public ModelAndView register(UserBean ub, ModelAndView model) {
		if (!(ub.getName().isEmpty() && ub.getPassword().isEmpty())) {
			model.setViewName("register");
			List<UserBean> userdata = ur.findByMobilenumber(ub.getMobilenumber());
			if (userdata.isEmpty()) {
				ur.save(ub);
				model.addObject("success", "You are successfully registered");
			} else {
				model.addObject("fail", "Your mobile number is already registered");
				model.setViewName("login");
			}
		}
		return model;
	}

	public ModelAndView dashboard(ModelAndView model, HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if (session == null) {
			model.setViewName("login");
			model.addObject("message", "session expired, please login again.");
		} else {
			model.setViewName("dashboard");
		}
		return model;
	}

	public ModelAndView products(ModelAndView model, HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if (session == null) {
			model.setViewName("login");
			model.addObject("message", "Login again");
		} else {
			model.setViewName("productlist");
		}
		return model;
	}
//---------------------------------------------------------------------------------------------------------
	public ModelAndView pay(ModelAndView model, HttpServletRequest request, String address, String add, Integer total) {
		HttpSession session= request.getSession(false);
		return model;
	}

	public ModelAndView orders(ModelAndView model, HttpServletRequest request) {
		   HttpSession session = request.getSession(false);
		   if(session!=null) {
			   UserBean user = (UserBean) session.getAttribute("user");
			   user = ur.findByName(user.getName()).get(0);
				session.setAttribute("transaction", user.getTransactions());
				model.setViewName("orders");
			} else {
				model.setViewName("login");
				model.addObject("message", "session expired, please login again.");
		   }
		return model;
	}

	public void removeaddress(Integer id, HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if (session != null) {
			UserBean user = (UserBean) session.getAttribute("user");
			user = ur.findByName(user.getName()).get();
			user = ur.getAddress(null);
		/*	List<Address> updateAddress = new ArrayList<Address>();
			for (Address a : list) {
				if (!(a.getId() == id)) {
					updateAddress.add(a);
				}
			}
			user.setAddress(updateAddress);*/
			ur.save(user);
		}
	}
}
