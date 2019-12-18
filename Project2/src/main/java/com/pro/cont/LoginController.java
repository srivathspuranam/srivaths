package com.pro.cont;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pro.service.LoginService;

@Controller
public class LoginController {

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response, ModelAndView model) {
		System.out.println(model);
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		System.out.println(name + password);
		if (!(name.isEmpty() || password.isEmpty())) {
			String role = LoginService.authenticate(name, password);
			if (!role.equals("failed")) {
				model = new ModelAndView("dashboard");
				model.addObject("role", role);
				model.addObject("name", name);
				HttpSession session = request.getSession();
				session.setAttribute("role", role);
				session.setAttribute("name", name);
				model.addObject("session", session);
			} else if (role.equals("error")) {
				model = new ModelAndView("login");
				model.addObject("message", "Server Busy!");
			} else {
				model = new ModelAndView("login");
				model.addObject("message", "Wrong username or password!");
			}
		} else {
			model = new ModelAndView("login");
			model.addObject("message", "InComplete Details.");
		}
		return model;
	}
}
