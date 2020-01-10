package com.shoppingportal.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
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
	public ModelAndView security(String name , String password, ModelAndView model, HttpSession session) {
		model = us.login(name, password, model, session);
		return model;
			}
	
	@GetMapping("/logout")
	public String logout() {
		return ("logout");
	}
	
	@PostMapping("/logout")
	public ModelAndView logout(ModelAndView model, HttpServletRequest request) {
	 HttpSession session = request.getSession(false);
	 session.invalidate();
	 model.addObject("message", "You are successfully logged out");
		return model;
	}
	
	@GetMapping("/register")
	public String register() {
		return ("register");
			}
	
	@PostMapping("/register")
	public ModelAndView register( UserBean ub , ModelAndView model) {
		model= us.register(ub, model);
		return model;
		}
	
	@GetMapping("checkout")
	public String checkout() {
		return("checkout");
	}
	
	@PostMapping("/checkout")
	public ModelAndView checkout(ModelAndView model, HttpSession session, ) {
		
	}
	
}

