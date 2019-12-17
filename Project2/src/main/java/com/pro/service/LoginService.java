package com.pro.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.pro.conn.connection;
import com.pro.model.Users;

public class LoginService {
	public static String authenticate(String name, String password) {
		String role = null;
		try {
			SessionFactory sf = connection.getSessionFactory();
			Session session = sf.openSession();
			Query query = session
					.createQuery("select count(*) from Users u where u.name = :name and u.password = :password");
			query.setParameter("name", name);
			query.setParameter("password", password);
			Long a = (Long) query.uniqueResult();
			if (a > 0) {
				query = session.createQuery("from Users u where u.name = :name and u.password = :password");
				query.setParameter("name", name);
				query.setParameter("password", password);
				Users result = (Users) query.uniqueResult();
				role = result.getRole();
				return role;
			} else {
				return role = "fail";
			}
		} catch (Exception e) {
			e.printStackTrace();
			return role = "error";
		}
	}
}
