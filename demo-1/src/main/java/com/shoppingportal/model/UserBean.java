package com.shoppingportal.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class UserBean {
	@Id
	private String name;
	private String password;
	private String date;
	private String mobilenumber;
	private String address; 
	@OneToOne
	private String shoppingcart;
	private String Transactions;  
	public String getShoppingcart() {
		return shoppingcart;
	}

	public void setShoppingcart(String shoppingcart) {
		this.shoppingcart = shoppingcart;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTransactions() {
		return Transactions;
	}

	public void setTransactions(String transactions) {
		Transactions = transactions;
	}

	@Override
	public String toString() {
		return "UserBean [name=" + name + ", password=" + password + ", date=" + date + ", mobilenumber=" + mobilenumber
				+ ", address=" + address + ", shoppingcart=" + shoppingcart + ", Transactions=" + Transactions + "]";
	}
}
