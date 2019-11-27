package com.sailo.web.welcome;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ContactServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Connection connection = null;
		PreparedStatement statement = null;
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		try {
			ServletContext context = getServletContext();
			String Driver = context.getInitParameter("dbDriver");
			String Host = context.getInitParameter("dbHost");
			String port = context.getInitParameter("dbport");
			String Uid = context.getInitParameter("dbUid");
			String password = context.getInitParameter("dbpassword");
			String sid = context.getInitParameter("dbsid");
			Class.forName(Driver);
			String url = "jdbc:oracle:thin:@" + Host + ":" + port + ":" + sid;
			connection = DriverManager.getConnection(url, Uid, password);
			statement = connection.prepareStatement("SELECT * FROM EMPLOYEES WHERE NAME=? ");
			HttpSession session = req.getSession(false);
			String userName = (String) session.getAttribute("sid");
			statement.setString(1, userName);
			ResultSet result = statement.executeQuery();
			result.next();
			String Name = result.getString(1);
			Date DOB = result.getDate(3);
			String gender = result.getString(4);
			String dept = result.getString(5);
			String role = result.getString(6);
			out.println("<h3>First Name - " + Name + "</h3>");
			out.println("<h3>Date Of Birth - " + DOB + "</h3>");
			out.println("<h3>Gender - " + gender + "</h3>");
			out.println("<h3>Department - " + dept + "</h3>");
			out.println("<h3>Role - " + role + "</h3>");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private ServletContext getServletContext() {
		// TODO Auto-generated method stub
		return null;
	}
}
