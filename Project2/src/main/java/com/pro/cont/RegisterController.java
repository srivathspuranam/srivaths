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

import com.pro.user.Users;

@Controller
public class RegisterController {

	@RequestMapping(value = "register", method = RequestMethod.GET)
	public String login() {
		return "register";
	}

	@RequestMapping(value = "register", method = RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response, ModelAndView mv) {
		String name = request.getParameter("name");
		String passwd = request.getParameter("passwd");
		String repasswd = request.getParameter("repasswd");
		String gender = request.getParameter("gender");
		String date = request.getParameter("date");
		String role = request.getParameter("role");
		Users user = new Users();
		user.setId(Integer.parseInt(request.getParameter("manager")));
		if (passwd.equals(repasswd)) {
			Users u = new Users();
			u.setName(name);
			u.setPasswd(passwd);
			u.setDate(date);
			u.setGender(gender);
			u.setRole(role);
			u.setManager(user);
			String register = RegisterService.register(u);
			mv = new ModelAndView("register");
			if (register.equals("fail")) {
				mv.addObject("fail", "Registration Failed!!");
			} else {
				mv.addObject("success", "Registration Sucessful.");
			}
			return mv;
		} else {
			mv = new ModelAndView("register");
			mv.addObject("message", "Passwords do not match");
			return mv;
		}

	}
}
