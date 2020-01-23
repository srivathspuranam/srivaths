package com.shoppingportal.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.shoppingcart.DAO.ProductRepository;
import com.shoppingcart.DAO.UserRepository;
import com.shoppingportal.model.AddressBean;
import com.shoppingportal.model.ProductBean;
import com.shoppingportal.model.TransactionBean;
import com.shoppingportal.model.UserBean;
import com.shoppingportal.model.YCartBean;

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

	public List<ProductBean> getProductBean() {
		List<ProductBean> products = pr.findAll();
		return products;
	}

	public void data() {
		ProductBean pb = new ProductBean();
		pb.setProductname("Tailored Jeans");
		pb.setAbout("It is a carefully hand crafted jeans");
		pb.setProductcategory("Clothes");
		pb.setProductcost(500);
		pr.save(pb);
		pb = new ProductBean();
		pb.setProductname("Bags");
		pb.setAbout("Light weight and waterproof bags.");
		pb.setProductcategory("Bags");
		pb.setProductcost(100);
		pr.save(pb);
		pb = new ProductBean();
		pb.setProductname("Pen");
		pb.setAbout("Easy flow.");
		pb.setProductcategory("Stationery");
		pb.setProductcost(10);
		pr.save(pb);

		/*
		 * UserBean user = new UserBean(); user.setName("user");
		 * user.setPassword("user"); user.setAddress("vittal rao nagar"); ur.save(user);
		 */
	}

	public ModelAndView login(String name, String password, ModelAndView model, HttpSession session) {
		UserBean user = ur.findByNameAndPassword(name, password);
		session.setAttribute("user", user);
		session.setMaxInactiveInterval(500);
		if (user != null) {
			model.setViewName("Dashboard");
		} else {
			model.setViewName("LoginPage");
			model.addObject("message", "Username or Password is incorrect, Please try again");
		}
		return model;
	}

	public ModelAndView logout(ModelAndView model, HttpServletRequest request) {
		model.setViewName("LoginPage");
		HttpSession session = request.getSession(false);
		if (session == null) {
			session.invalidate();
			model.addObject("message", "You are successfully logged out");
		} else {
			model.addObject("message", "login again");
		}
		return model;
	}

	public ModelAndView register(UserBean ub, ModelAndView model) {
		if (!(ub.getName().isEmpty() && ub.getPassword().isEmpty())) {
			model.setViewName("RegisterPage");

			List<UserBean> userdata = ur.findByMobilenumber(ub.getMobilenumber());
			if (userdata.isEmpty()) {
				ur.save(ub);
				model.addObject("message", "You are successfully registered");
				System.out.println(ub.getMobilenumber());
			} else {
				model.addObject("message", "Your account is already registered");
				model.setViewName("LoginPage");
			}
		}
		return model;
	}

	public ModelAndView dashboard(ModelAndView model, HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if (session == null) {
			model.setViewName("LoginPage");
			model.addObject("message", "session expired, please login again.");
		} else {
			model.setViewName("Dashboard");
		}
		return model;
	}

	public ModelAndView products(ModelAndView model, HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if (session == null) {
			model.setViewName("LoginPage");
			model.addObject("message", "Login again");
		} else {

			List<ProductBean> products = pr.findAll();
			model.setViewName("Products");
			model.addObject("products", products);
		}
		return model;
	}

	public ModelAndView addtocart(ModelAndView model, HttpServletRequest request, YCartBean cart) {
		HttpSession session = request.getSession(false);
		Boolean flag = false;
		if (session != null) {
			UserBean user = (UserBean) session.getAttribute("user");
			user = ur.findByNameAndPassword(user.getName(), user.getPassword());
			List<YCartBean> ycart = new ArrayList<YCartBean>();
			if (!user.getShoppingcart().isEmpty()) {
				List<YCartBean> usercart = user.getShoppingcart();
				for (YCartBean addcart : usercart) {
					if (addcart.getName().equals(cart.getName())) {
						addcart.setQuantity(addcart.getQuantity() + cart.getQuantity());
						flag = true;
					}
					ycart.add(addcart);
				}
				if (!flag) {
					ycart.add(cart);
				}
				user.setShoppingcart(ycart);
				ur.save(user);
				System.out.println(ycart);
			} else {
				List<YCartBean> updateCart = new ArrayList<YCartBean>();
				updateCart.add(cart);
				user.setShoppingcart(updateCart);
				ur.save(user);
				System.out.println(updateCart);
			}
			session.setAttribute("user", user);
		} else {
			model.setViewName("LoginPage");
			model.addObject("message", "Session expired, please login again");
		}
		return model;
	}

	public ModelAndView yourcart(ModelAndView model, HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if (session == null) {
			model.setViewName("LoginPage");
			model.addObject("message", "please login first");
		} else {
			UserBean user = (UserBean) session.getAttribute("user");
			user = ur.findByNameAndPassword(user.getName(), user.getPassword());
			if (user != null) {
				List<YCartBean> ycart = user.getShoppingcart();
				session.setAttribute("product", ycart);
			}
			model.setViewName("YCart");
		}
		return model;
	}

	public void removeproduct(YCartBean cart, HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if (session != null) {
			UserBean user = (UserBean) session.getAttribute("user");
			List<YCartBean> ycart = ur.findByMobilenumber(user.getMobilenumber()).get(0).getShoppingcart();
			List<YCartBean> newcart = new ArrayList<YCartBean>();
			
			for (YCartBean temp : ycart) {
				if (!(temp.getId() == cart.getId())) {
					System.out.println(temp);
					newcart.add(temp);
				}
			}
			user.setShoppingcart(newcart);
			System.out.println(newcart);
			ur.save(user);
		}
	}

	public ModelAndView cancelorder(ModelAndView model, HttpServletRequest request) {
		model.setViewName("Products");
		HttpSession session = request.getSession(false);
		if (session == null) {
			session.invalidate();
			model.addObject("message", "Couldnot cancel the order");
		} else {
			model.addObject("message", "Order is succesfully cancelled");
		}
		return model;
	}

	public ModelAndView orders(ModelAndView model, HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if (session != null) {
			UserBean user = (UserBean) session.getAttribute("user");
			user = ur.findByName(user.getName()).get(0);
			session.setAttribute("transaction", user.getTransactions());
			model.setViewName("Orders");
		} else {
			model.setViewName("LoginPage");
			model.addObject("message", "session expired, please login again.");
		}
		return model;
	}

	public ModelAndView pay(ModelAndView model, HttpServletRequest request, String address, String add, Integer total) {
		HttpSession session = request.getSession(false);
		if (session != null) {
			UserBean user = (UserBean) session.getAttribute("user");
			TransactionBean tb = new TransactionBean();
			tb.setTransactionid(UUID.randomUUID().toString());
			Date date = new Date();
			tb.setDate(date.toString());
			List<YCartBean> ycart = new ArrayList<YCartBean>();
			user = ur.findByNameAndPassword(user.getName(), user.getPassword());

			List<YCartBean> cart = user.getShoppingcart();
			for (YCartBean temp : cart) {
				YCartBean items = new YCartBean();
				items.setName(temp.getName());
				items.setPrice(temp.getPrice());
				items.setQuantity(temp.getQuantity());
				ycart.add(items);
			}
			tb.setItems(ycart);
			tb.setTotal(total);
			tb.setStatus("Success");
			tb.setAddress(address);
			System.out.println(user.getAddress());

			List<TransactionBean> transactions = user.getTransactions();
			transactions.add(tb);
			user.setShoppingcart(null);
			user.setTransactions(transactions);
			ur.save(user);
			String day = LocalDate.now().plusDays(2).format(DateTimeFormatter.ofPattern("dd-MMM"));
			session.setAttribute("tb", tb);
			System.out.println(tb);
			System.out.println(tb.getItems());
			session.setAttribute("day", day);
			model.setViewName("CheckOut");
		} else {
			model.setViewName("LoginPage");
			model.addObject("message", "Session expired, Please login again!");
		}
		return model;
	}

	public ModelAndView profile(UserBean ub, ModelAndView model, HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if (session != null) {
			model.setViewName("Profile");
		} else {
			model.setViewName("LoginPage");
			model.addObject("message", "Please login");
		}
		return model;
	}

	public ModelAndView editprofile(ModelAndView model, HttpServletRequest request) {
		HttpSession session = request.getSession(false);
	if(session != null) {
		model.setViewName("EditP");
		System.out.println(session);
	}else {
		model.setViewName("LoginPage");
		model.addObject("message", "Try again after sometime");
	}
		return model;
	}
	

	/*public void addaddress(AddressBean address, HttpServletRequest request) {
		HttpSession session=request.getSession(false);
		if (session != null) {
			UserBean user = (UserBean) session.getAttribute("user");
		List<AddressBean> addaddress = ur.findByMobilenumber(user.getMobilenumber()).get(0).getAddress();
		List<AddressBean> updateaddress = new ArrayList<AddressBean>();
		for (AddressBean temp:addaddress) {
			updateaddress.add(temp);
		}updateaddress.add(address);
		user.setAddress(updateaddress);
		ur.save(user);	
		}
		
	}*/

}
