package com.shoppingportal.service;

import java.util.List;

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
	
	public List <ProductBean> getAll(){
		List<ProductBean> products = pr.findAll();
		return getAll();
			}
	
	public ModelAndView login(String name, String password, ModelAndView model, HttpSession session) {
		UserBean user = ur.findByNameAndPassword(name, password);
		session.setAttribute("User", user);
		if(user!=null){
			model.setViewName("dashboard");
		}else {
			model.setViewName("login");
			model.addObject("message","Username or Password is incorrect, Please try again");
		}
		return model;
			}

	public ModelAndView register(UserBean ub, ModelAndView model) {
		if(!(ub.getName().isEmpty() && ub.getPassword().isEmpty())) {
			model.setViewName("register");
			List<UserBean> userdata = ur.findByMobilenumber(ub.getMobilenumber());
		if(userdata.isEmpty()) {
			ur.save(ub);
			model.addObject("success","You are successfully registered");
		}else {
			model.addObject("fail", "Your mobile number is already registered");
			model.setViewName("login");
		}
		}
		return model;
	}
	
	
	
}
