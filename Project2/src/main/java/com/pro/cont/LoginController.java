package com.pro.cont;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response, ModelAndView mv) {
		String name = request.getParameter("name");
		String passwd = request.getParameter("passwd");
		System.out.println(name + passwd);
		if (!(name.isEmpty() || passwd.isEmpty())) {
			String role = LoginService.authenticate(name, passwd);
			if (!role.equals("failed")) {
				mv = new ModelAndView("web");
				mv.addObject("role", role);
				mv.addObject("name", name);
				HttpSession session = request.getSession();
				session.setAttribute("role", role);
				session.setAttribute("name", name);
				mv.addObject("session", session);
			} else if (role.equals("error")) {
				mv = new ModelAndView("login");
				mv.addObject("message", "Server Busy!");
			} else {
				mv = new ModelAndView("login");
				mv.addObject("message", "Wrong username or password!");
			}
		} else {
			mv = new ModelAndView("login");
			mv.addObject("message", "InComplete Details.");
		}
		return mv;
	}
}
