package com.pro.cont;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.pro.conn.connection;
import com.pro.user.Users;

public class LoginService {
	public static String authenticate(String name, String passwd) {
		String role = null;
		try {
			SessionFactory sessionFactory = connection.getSessionFactory();
			Session session = sessionFactory.openSession();
			Query query = session.createQuery("select count(*) from Users u where e.name = :name and e.passwd = :passwd");
			query.setParameter("name", name);
			query.setParameter("password", passwd);
			Long l = (Long) query.uniqueResult();
			if (l > 0) {
				query = session.createQuery("from Users u where e.name = :name and e.passwd = :passwd");
				query.setParameter("name", name);
				query.setParameter("password", passwd);
				Users result = (Users) query.uniqueResult();
				role = result.getRole();
				return role;
			} else {
				return role = "failed";
			}
		} catch (Exception e) {
			e.printStackTrace();
			return role = "error";
		}
	}
}
