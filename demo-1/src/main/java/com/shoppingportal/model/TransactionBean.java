package com.shoppingportal.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TransactionBean {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String transactionid;
	private String date;
	private String address;
	@OneToMany(cascade = CascadeType.ALL)
	private List<YCartBean> items;
	private int total;
	private String status;

	@Override
	public String toString() {
		return "TransactionBean [id=" + id + ", transactionid=" + transactionid + ", date=" + date + ", address="
				+ address + ", items=" + items + ", total=" + total + ", status=" + status + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTransactionid() {
		return transactionid;
	}

	public void setTransactionid(String transactionid) {
		this.transactionid = transactionid;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<YCartBean> getItems() {
		return items;
	}

	public void setItems(List<YCartBean> items) {
		this.items = items;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
