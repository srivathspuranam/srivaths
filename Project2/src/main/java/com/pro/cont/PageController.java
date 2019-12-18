package com.pro.cont;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pro.model.Users;
import com.pro.service.PagesService;

@Controller
public class PageController {

	@RequestMapping(value = "registerpage", method = RequestMethod.GET)
	public ModelAndView registerpage(HttpServletRequest request, HttpServletResponse response, ModelAndView model) {
		try {
			List list = PagesService.getList();
			model.setViewName("register.jsp");
			model.addObject("list", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return model;
	}

	@RequestMapping(value = "taskpage", method = RequestMethod.GET)
	public ModelAndView taskpage(HttpServletRequest request, HttpServletResponse response, ModelAndView model) {
		try {
			HttpSession session = request.getSession(false);
			String name = (String) session.getAttribute("name");
			Users result = PagesService.getResult(name);
			model.setViewName("task.jsp");
			model.addObject("result", result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return model;
	}

	@RequestMapping(value = "newtaskpage", method = RequestMethod.GET)
	public ModelAndView newtaskpage(HttpServletRequest request, HttpServletResponse response, ModelAndView model) {
		try {
			HttpSession session = request.getSession(false);
			String name = (String) session.getAttribute("name");
			List list = PagesService.getList();
			model.setViewName("newtask.jsp");
			model.addObject("list", list);
			model.addObject("name", name);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return model;
	}
}
