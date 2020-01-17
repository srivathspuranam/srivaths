package com.shoppingportal.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shoppingportal.model.UserBean;
import com.shoppingportal.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService us;

	@GetMapping(path = "/")
	public ModelAndView start(ModelAndView model) {
		model.setViewName("login");
		return model;
	}

	@PostMapping("/login")
	public ModelAndView security(String name, String password, ModelAndView model, HttpSession session) {
		model = us.login(name, password, model, session);
		return model;
	}

	@GetMapping("/logout")
	public ModelAndView logout (ModelAndView model, HttpServletRequest request) {
		model=us.logout(model, request);
		return model;
	}

	@GetMapping("/register")
	public String register() {
		return ("register");
	}

	@PostMapping("/register")
	public ModelAndView register(UserBean ub, ModelAndView model) {
		model = us.register(ub, model);
		return model;
	}

	@GetMapping("/dashboard")
	public ModelAndView dashboard(ModelAndView model, HttpServletRequest request) {
		model = us.dashboard(model, request);
		return model;
	}

	@GetMapping("/products")
	public ModelAndView products(ModelAndView model, HttpServletRequest request) {
		model = us.products(model, request);
		return model;
	}

	@PostMapping("/pay")
	public ModelAndView pay(ModelAndView model, HttpServletRequest request, String address, String add, Integer total) {
		model = us.pay(model, request, address, add, total);
		return model;
	}
	
	@GetMapping("/orders")
	public ModelAndView orders(ModelAndView model, HttpServletRequest request) {
		model=us.orders(model, request);
		return model;
	}

	
	
	
	
	
	
	
	/*
	 * @GetMapping("checkout") public String checkout() { return("checkout"); }
	 * 
	 * @PostMapping("/checkout") public ModelAndView checkout(ModelAndView model,
	 * HttpSession session, ) {
	 * 
	 * }
	 */

}
