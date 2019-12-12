package com.pro.conn;

import javax.servlet.ServletContext;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class connection {
	private static SessionFactory sessionFactory = null;

	public synchronized static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			try {
				sessionFactory = new Configuration().configure().buildSessionFactory();
				return sessionFactory;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return sessionFactory;
	}
}
