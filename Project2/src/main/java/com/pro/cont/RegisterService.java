package com.pro.cont;

import javax.servlet.http.HttpServlet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.pro.conn.connection;
import com.pro.user.Users;


public class RegisterService {

	public static String register(Users us) {
		String register = null;
		Transaction tx = null;
		try {
			SessionFactory sf = connection.getSessionFactory();
			Session session = sf.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(us);
			tx.commit();
			register = "success";
		} catch (Exception e) {
			e.printStackTrace();
			register = "failed";
		}
		return register;
	}
}
