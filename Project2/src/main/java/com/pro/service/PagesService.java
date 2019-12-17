package com.pro.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.pro.conn.connection;
import com.pro.model.Users;

public class PagesService {

	public static List getList() {
		List list = null;
		try {
			SessionFactory sf = connection.getSessionFactory();
			Session s = sf.openSession();
			Query query = s.createQuery("from Users");
			list = query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public static Users getResult(String name) {
		try {
			SessionFactory sf = connection.getSessionFactory();
			Session s = sf.openSession();
			Query query = s.createQuery("from Users u where u.name = :name");
			query.setParameter("name", name);
			Users user = (Users) query.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}
}
