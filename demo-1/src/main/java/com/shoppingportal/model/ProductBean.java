package com.shoppingportal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductBean {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productid;
	private String productname;
	private int productcost;
	private String productcategory;
	private int productstock;
	private String about;

	@Override
	public String toString() {
		return "ProductBean [productid=" + productid + ", productname=" + productname + ", productcost=" + productcost
				+ ", productcategory=" + productcategory + ", productstock=" + productstock + ", about=" + about + "]";
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public int getProductcost() {
		return productcost;
	}

	public void setProductcost(int productcost) {
		this.productcost = productcost;
	}

	public String getProductcategory() {
		return productcategory;
	}

	public void setProductcategory(String productcategory) {
		this.productcategory = productcategory;
	}

	public int getProductstock() {
		return productstock;
	}

	public void setProductstock(int productstock) {
		this.productstock = productstock;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

}
