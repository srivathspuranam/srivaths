package com.example.control;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.User;
import com.example.repo.Urepository;

@RestController
public class UController {

@Autowired
Urepository us ;

public ModelAndView save(ModelAndView model) {
	model.setViewName("Home");
	return null;}
	
 @GetMapping(path = "/", produces = "application/JSON")
public String login() {
	return "login";
	  }
 
 @PostMapping("/login")
	public ModelAndView authenticate(String name, String password, String email, ModelAndView model) {
		us.
		return model;
	}
}
