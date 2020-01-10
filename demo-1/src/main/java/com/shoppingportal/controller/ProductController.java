package com.shoppingportal.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shoppingportal.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	ProductService ps;
	
	@GetMapping("/dashboard")
	public ModelAndView dashboard(ModelAndView model, HttpSession session, String productname, String productcost, Integer productquantity) {
		
		return model;
			}
	
}
