package com.pro.conn;

import javax.servlet.ServletContext;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class connection {
	private static SessionFactory sf = null;

	public synchronized static SessionFactory getSessionFactory() {
		if (sf == null) {
			try {
				sf = new Configuration().configure().buildSessionFactory();
				return sf;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return sf;
	}
}
