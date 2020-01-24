package com.shoppingportal.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.servlet.ModelAndView;

import com.shoppingportal.model.AddressBean;
import com.shoppingportal.model.UserBean;
import com.shoppingportal.model.YCartBean;
import com.shoppingportal.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService us;

	@GetMapping
	public ModelAndView start(ModelAndView model) {
		model.setViewName("LoginPage");
		// us.data();
		return model;
	}

//---------------------------------------------USER--------------------------------------------------

	@PostMapping("/login")
	public ModelAndView security(String name, String password, ModelAndView model, HttpSession session) {
		model = us.login(name, password, model, session);
		return model;
	}

	@GetMapping("/logout")
	public ModelAndView logout(ModelAndView model, HttpServletRequest request) {
		model = us.logout(model, request);
		return model;
	}

	@GetMapping("/register")
	public ModelAndView register(ModelAndView model) {
		model.setViewName("RegisterPage");
		return model;
	}

	@PostMapping("/register")
	public ModelAndView register(UserBean ub, ModelAndView model, HttpServletRequest request) {
		model = us.register(ub, model, request);

		return model;
	}

	@GetMapping("/dashboard")
	public ModelAndView dashboard(ModelAndView model, HttpServletRequest request) {
		model = us.dashboard(model, request);
		return model;
	}

	@GetMapping("/profile")
	public ModelAndView profile(ModelAndView model, HttpServletRequest request, UserBean ub) {
		model = us.profile(ub, model, request);
		return model;
	}

	@GetMapping("editprofile")
	public ModelAndView editprofile(ModelAndView model, HttpServletRequest request) {
		model = us.editprofile(model, request);
		return model;
	}
//---------------------------------------------------PRODUCT--------------------------------

	@GetMapping("/products")
	public ModelAndView products(ModelAndView model, HttpServletRequest request) {
		model = us.products(model, request);
		return model;
	}

	@GetMapping("/orders")
	public ModelAndView orders(ModelAndView model, HttpServletRequest request) {
		model = us.orders(model, request);
		return model;
	}

	@PostMapping("/addtocart")
	public ModelAndView addtocart(ModelAndView model, HttpServletRequest request, YCartBean cart) {
		model = us.addtocart(model, request, cart);
		return model;
	}

	@PostMapping("/removeproduct")
	public void removeproduct(YCartBean ycart, HttpServletRequest request) {
		us.removeproduct(ycart, request);

	}

	@PostMapping("cancelorder")
	public ModelAndView cancelorder(ModelAndView model, HttpServletRequest request) {
		model = us.cancelorder(model, request);
		return model;
	}

	@GetMapping("/yourcart")
	public ModelAndView yourcart(ModelAndView model, HttpServletRequest request) {
		model = us.yourcart(model, request);
		return model;
	}

	@PostMapping("/pay")
	public ModelAndView pay(ModelAndView model, HttpServletRequest request, String address, String newaddress,
			Integer total) {
		model = us.pay(model, request, address, newaddress, total);
		System.out.println(address + newaddress + total);
		return model;
	}

}
