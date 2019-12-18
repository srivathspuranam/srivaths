package com.pro.cont;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pro.model.Users;
import com.pro.service.TaskService;

@Controller
public class TaskController {

	@RequestMapping(value = "task", method = RequestMethod.GET)
	public String login() {
		return "task";
	}

	@RequestMapping(value = "task", method = RequestMethod.POST)
	public ModelAndView task(HttpServletRequest request, HttpServletResponse response, ModelAndView model) {
		HttpSession session = request.getSession(false);
		String name = (String) session.getAttribute("name");
		String tstatus = request.getParameter("status_value");
		if (!tstatus.isEmpty()) {
			String result = TaskService.setStatus(name, tstatus);
			if (result.equals("success")) {
				model = new ModelAndView("task");
				model.addObject("success", "Updated status!");
			} else if (result.equals("fail")) {
				model = new ModelAndView("task");
				model.addObject("fail", "Failed updating status!");
			} else {
				model = new ModelAndView("task");
				model.addObject("fail", result);
			}
		} else {
			model = new ModelAndView("task");
			model.addObject("fail", "No Status");
		}
		return model;
	}

	@RequestMapping(value = "newtask", method = RequestMethod.POST)
	public ModelAndView newtask(HttpServletRequest request, HttpServletResponse response, ModelAndView model) {
		String task = request.getParameter("task");
		int id = Integer.parseInt(request.getParameter("employee"));
		String assigned = request.getParameter("assigned");
		if (!task.isEmpty()) {
			String result = TaskService.setTask(id, task, assigned);
			if (result.equals("success")) {
				model = new ModelAndView("newtask");
				model.addObject("success", "Status Updated!");
			} else if (result.equals("fail")) {
				model = new ModelAndView("newtask");
				model.addObject("fail", "Failed updating status!");
			} else {
				model = new ModelAndView("newtask");
				model.addObject("fail", result);
			}
		} else {
			model = new ModelAndView("newtask");
			model.addObject("fail", "No Status");
		}
		return model;
	}

	@RequestMapping(value = "getstatus", method = RequestMethod.GET)
	public ModelAndView getstatus(HttpServletRequest request, HttpServletResponse response, ModelAndView model) {
		HttpSession session = request.getSession(false);
		String name = (String) session.getAttribute("name");
		if (name != null) {
			Users task = TaskService.getStatus(name);
			if (task != null) {
				model = new ModelAndView("status");
				model.addObject("employee", task.getName());
				model.addObject("task", task.getTask());
				model.addObject("status_value", task.getTstatus());
			} else {
				model = new ModelAndView("status");
				model.addObject("ok", "No task Assigned yet");
			}
		} else {
			model = new ModelAndView("login");
			model.addObject("fail", "Please login first!");
		}
		return model;
	}
}
