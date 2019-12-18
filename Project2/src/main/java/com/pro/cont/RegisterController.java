package com.pro.cont;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pro.model.Users;
import com.pro.service.RegisterService;

@Controller
public class RegisterController {

	@RequestMapping(value = "register", method = RequestMethod.GET)
	public String login() {
		return "register";
	}

	@RequestMapping(value = "register", method = RequestMethod.POST)
	public ModelAndView register(HttpServletRequest request, HttpServletResponse response, ModelAndView model) {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String repassword = request.getParameter("repassword");
		String gender = request.getParameter("gender");
		String date = request.getParameter("date");
		String role = request.getParameter("role");
		Users user = new Users();
		user.setId(Integer.parseInt(request.getParameter("manager")));
		if (password.equals(repassword)) {
			Users us = new Users();
			us.setName(name);
			us.setPassword(password);
			us.setDob(date);
			us.setGender(gender);
			us.setRole(role);
			us.setManager(user);
			String register = RegisterService.register(us);
			model = new ModelAndView("register");
			if (register.equals("fail")) {
				model.addObject("fail", "Registration Failed!!");
			} else {
				model.addObject("success", "Registration Sucessful.");
			}
			return model;
		} else {
			model = new ModelAndView("register");
			model.addObject("message", "Passwords do not match");
			return model;
		}

	}
}
