package com.shoppingportal.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shoppingportal.model.ProductBean;
import com.shoppingportal.model.YCartBean;
import com.shoppingportal.service.ProductService;

@Controller
public class ProductController {

	@Autowired
	ProductService ps;

	// ---------------------------------------------------PRODUCT--------------------------------

	@GetMapping("/addproduct")
	public ModelAndView addproduct(ModelAndView model) {
		model.setViewName("Admin");
		return model;
	}

	@PostMapping("/addproduct")
	public ModelAndView addproduct(ModelAndView model, HttpServletRequest request, ProductBean pb) {
		model = ps.addproduct(model, request, pb);
		return model;
	}

	@GetMapping("/editproduct")
	public ModelAndView editproduct(ModelAndView model, HttpServletRequest request, Integer id) {
		model = ps.editproduct(model, request, id);
		return model;
	}

	@GetMapping("deleteproduct")
	public ModelAndView deleteproduct(ModelAndView model, HttpServletRequest request, Integer id) {
		model = ps.deleteproduct(model, request, id);
		return model;
	}

	@GetMapping("/products")
	public ModelAndView products(ModelAndView model, HttpServletRequest request) {
		model = ps.products(model, request);
		return model;
	}

	@PostMapping("/removeproduct")
	public void removeproduct(YCartBean ycart, HttpServletRequest request) {
		ps.removeproduct(ycart, request);
	}
	
	@PostMapping("/updatestock")
		public void updateproduct(HttpServletRequest request, Integer id) {
			ps.updatestock(request, id);
		}
	  

}
