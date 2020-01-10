package com.shoppingportal.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductBean {
	@Id
	private String productname;
	private String productcost;
	private int productquantity;

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getProductcost() {
		return productcost;
	}

	public void setProductcost(String productcost) {
		this.productcost = productcost;
	}

	public int getProductquantity() {
		return productquantity;
	}

	public void setProductquantity(int productquantity) {
		this.productquantity = productquantity;
	}

	@Override
	public String toString() {
		return "ProductBean [productname=" + productname + ", productcost=" + productcost + ", productquantity="
				+ productquantity + "]";
	}
}
