
package com.shoppingportal.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class UserBean {
	@Id
	private String name;
	private String password;
	private String date;
	private Long mobilenumber;
	private String address;
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<YCartBean> shoppingcart;
	@OneToMany(cascade = CascadeType.ALL)
	private List<TransactionBean> Transactions;

	@Override
	public String toString() {
		return "UserBean [name=" + name + ", password=" + password + ", date=" + date + ", mobilenumber=" + mobilenumber
				+ ", address=" + address + ", shoppingcart=" + shoppingcart + ", Transactions=" + Transactions + "]";
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

	public Long getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(Long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<YCartBean> getShoppingcart() {
		return shoppingcart;
	}

	public void setShoppingcart(List<YCartBean> shoppingcart) {
		this.shoppingcart = shoppingcart;
	}

	public List<TransactionBean> getTransactions() {
		return Transactions;
	}

	public void setTransactions(List<TransactionBean> transactions) {
		Transactions = transactions;
	}

}
