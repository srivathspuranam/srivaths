package com.pro.conn;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletContext;

public class connection {
	private static Connection con = null;

	public synchronized Connection getConnection(ServletContext conn) {
		try {
			ServletContext context = conn;
			String Driver = context.getInitParameter("dbDriver");
			String Host = context.getInitParameter("dbHost");
			String port = context.getInitParameter("dbport");
			String Uid = context.getInitParameter("dbUid");
			String password = context.getInitParameter("dbpassword");
			String sid = context.getInitParameter("dbsid");
			Class.forName(Driver);
			String url = "jdbc:oracle:thin:@" + Host + ":" + port + ":" + sid;
			con = DriverManager.getConnection(url, Uid, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
