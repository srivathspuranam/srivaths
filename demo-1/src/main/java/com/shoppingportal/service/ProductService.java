package com.shoppingportal.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.shoppingcart.DAO.ProductRepository;
import com.shoppingcart.DAO.UserRepository;
import com.shoppingportal.model.ProductBean;
import com.shoppingportal.model.TransactionBean;
import com.shoppingportal.model.UserBean;
import com.shoppingportal.model.YCartBean;

@Service
public class ProductService {

	@Autowired
	ProductRepository pr;

	@Autowired
	UserRepository ur;

	public void save(UserBean ub) {
		ur.save(ub);
	}

	public void delete(String name) {
		ur.deleteByName(name);
	}

	public List<ProductBean> getProductBean() {
		List<ProductBean> products = pr.findAll();
		return products;
	}

	// ------------------------------------------PRODUCT-----------------------------------------------

	public ModelAndView products(ModelAndView model, HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if (session == null) {
			model.setViewName("LoginPage");
			model.addObject("message", "Login again");
		} else {

			List<ProductBean> products = pr.findAll();
			model.setViewName("Products");
			model.addObject("products", products);
		}
		return model;
	}

	public void removeproduct(YCartBean cart, HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if (session != null) {
			UserBean user = (UserBean) session.getAttribute("user");
			List<YCartBean> ycart = ur.findByMobilenumber(user.getMobilenumber()).get(0).getShoppingcart();
			List<YCartBean> newcart = new ArrayList<YCartBean>();

			for (YCartBean temp : ycart) {
				if (!(temp.getId() == cart.getId())) {
										newcart.add(temp);
				}
			}
			user.setShoppingcart(newcart);
						ur.save(user);
		}
	}

	public ModelAndView addproduct(ModelAndView model, HttpServletRequest request, ProductBean pb) {
		HttpSession session = request.getSession(false);
		model.setViewName("Admin");
		pr.save(pb);
		model.addObject("message", "product is successfully added");
		return model;
	}

	public ModelAndView editproduct(ModelAndView model, HttpServletRequest request, Integer id) {
		HttpSession session = request.getSession(false);
		ProductBean product = pr.findById(id).get();
		if (session != null) {
			model.setViewName("EditProduct");
			model.addObject("product", product);
		} else {
			model.setViewName("LoginPage");
			model.addObject("message", "Try again after sometime");
		}
		return model;
	}

	public ModelAndView deleteproduct(ModelAndView model, HttpServletRequest request, Integer productid) {
		HttpSession session = request.getSession(false);
		pr.deleteById(productid);
		model.setViewName("Products");
		model.addObject("message", "Product is removed");
		return model;
	}

	public void updatestock(HttpServletRequest request,Integer id) {
		HttpSession session= request.getSession(false);
		ProductBean product = (ProductBean) session.getAttribute("product");
		product = pr.findById(product.getProductcost()).get();
		System.out.println(product);
	}

	
	
	
	
	
}
