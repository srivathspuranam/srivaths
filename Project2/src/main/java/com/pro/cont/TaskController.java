package com.pro.cont;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pro.user.Users;
import com.pro.cont.TaskService;

@Controller
public class TaskController {

	@RequestMapping(value = "task", method = RequestMethod.GET)
	public String login() {
		return "task";
	}

	@RequestMapping(value = "task", method = RequestMethod.POST)
	public ModelAndView task(HttpServletRequest request, HttpServletResponse response, ModelAndView mv) {
		HttpSession session = request.getSession(false);
		String name = (String) session.getAttribute("name");
		String tstatus = request.getParameter("status_value");
		if (!tstatus.isEmpty()) {
			String result = TaskService.setStatus(name, tstatus);
			if (result.equals("success")) {
				mv = new ModelAndView("task");
				mv.addObject("success", "Updated status!");
			} else if (result.equals("fail")) {
				mv = new ModelAndView("task");
				mv.addObject("fail", "Failed updating status!");
			} else {
				mv = new ModelAndView("task");
				mv.addObject("fail", result);
			}
		} else {
			mv = new ModelAndView("task");
			mv.addObject("fail", "No Status");
		}
		return mv;
	}

	@RequestMapping(value = "newtask", method = RequestMethod.POST)
	public ModelAndView newtask(HttpServletRequest request, HttpServletResponse response, ModelAndView mv) {
		String task = request.getParameter("task");
		int id = Integer.parseInt(request.getParameter("employee"));
		String assigned = request.getParameter("assigned");
		if (!task.isEmpty()) {
			String result = TaskService.setTask(id, task, assigned);
			if (result.equals("success")) {
				mv = new ModelAndView("newtask");
				mv.addObject("success", "Status Updated!");
			} else if (result.equals("fail")) {
				mv = new ModelAndView("newtask");
				mv.addObject("fail", "Failed updating status!");
			} else {
				mv = new ModelAndView("newtask");
				mv.addObject("fail", result);
			}
		} else {
			mv = new ModelAndView("newtask");
			mv.addObject("fail", "No Status");
		}
		return mv;
	}

	@RequestMapping(value = "getstatus", method = RequestMethod.GET)
	public ModelAndView getstatus(HttpServletRequest request, HttpServletResponse response, ModelAndView mv) {
		HttpSession session = request.getSession(false);
		String name = (String) session.getAttribute("name");
		if (name != null) {
			Users task = TaskService.getStatus(name);
			if (task != null) {
				mv = new ModelAndView("status");
				mv.addObject("employee", task.getName());
				mv.addObject("task", task.getTask());
				mv.addObject("status_value", task.getTstatus());
			} else {
				mv = new ModelAndView("status");
				mv.addObject("ok", "No task Assigned yet");
			}
		} else {
			mv = new ModelAndView("login");
			mv.addObject("fail", "Please login first!");
		}
		return mv;
	}
}
