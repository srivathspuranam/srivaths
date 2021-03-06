package com.pro.cont;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LogoutController {

	@RequestMapping(value = "logout", method = RequestMethod.GET)
	public String login() {
		return "logout";
	}

	@RequestMapping(value = "logout", method = RequestMethod.POST)
	public ModelAndView logout(HttpServletRequest request, HttpServletResponse response, ModelAndView model) {
		HttpSession session = request.getSession(false);
		if (session != null) {
			session.invalidate();
			model = new ModelAndView("login");
			model.addObject("message", "Please login first!");
		} else {
			model = new ModelAndView("login");
			model.addObject("logout", "logged out!");
		}
		return model;
	}
}
