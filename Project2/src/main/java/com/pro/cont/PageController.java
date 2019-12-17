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
	public ModelAndView reg(HttpServletRequest request, HttpServletResponse response, ModelAndView mv) {
		try {
			List list = PagesService.getList();
			mv.setViewName("register.jsp");
			mv.addObject("list", list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mv;
	}

	@RequestMapping(value = "taskpage", method = RequestMethod.GET)
	public ModelAndView etask(HttpServletRequest request, HttpServletResponse response, ModelAndView mv) {
		try {
			HttpSession session = request.getSession(false);
			String name = (String) session.getAttribute("name");
			Users result = PagesService.getResult(name);
			mv.setViewName("task.jsp");
			mv.addObject("result", result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mv;
	}

	@RequestMapping(value = "newtaskpage", method = RequestMethod.GET)
	public ModelAndView ctask(HttpServletRequest request, HttpServletResponse response, ModelAndView mv) {
		try {
			HttpSession session = request.getSession(false);
			String name = (String) session.getAttribute("name");
			List list = PagesService.getList();
			mv.setViewName("newtask.jsp");
			mv.addObject("list", list);
			mv.addObject("name", name);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mv;
	}
}
