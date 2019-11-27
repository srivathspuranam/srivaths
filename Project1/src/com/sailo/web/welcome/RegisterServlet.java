package com.sailo.web.welcome;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {

	Connection connnection = null;
	PreparedStatement statement = null;
	PreparedStatement verify = null;

	@Override
	public void init() throws ServletException {
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
			connnection = DriverManager.getConnection(url, Uid, password);
			connnection.setAutoCommit(false);
			statement = connnection.prepareStatement("INSERT INTO EMPLOYEES VALUES (?,?,?,?,?,?)");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		try {
			String Name = req.getParameter("name");
			String passwd = req.getParameter("passwd");
			String repasswd = req.getParameter("re-passwd");
			String dob = req.getParameter("date");
			String gender = req.getParameter("gender");
			String dept = req.getParameter("dept");
			String role = req.getParameter("role");
			if (!passwd.equals(repasswd)) {
				out.println("<h3 style=\"color: red;\">Password does not Match!!</h3>");
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("RegisterForm.html");
				requestDispatcher.include(req, resp);
				return;
			}
			statement.setString(1, Name);
			statement.setString(2, passwd);
			statement.setString(3, dob);
			statement.setString(4, gender);
			statement.setString(5, dept);
			statement.setString(6, role);
			verify = connnection.prepareStatement("SELECT COUNT(*) FROM EMPLOYEES WHERE NAME=?");
			verify.setString(1, Name);
			ResultSet executeQuery = verify.executeQuery();
			executeQuery.next();
			int count = executeQuery.getInt(1);
			if (count == 1) {
				out.println("<h3 style=\"color: red;\">Name already exists!</h3>");
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("RegisterForm.html");
				requestDispatcher.include(req, resp);
			} else {
				statement.executeUpdate();
				out.println("<h3 style=\"color: green;\">Sucessfully registered!</h3>");
				connnection.commit();
				RequestDispatcher requestDispatcher = req.getRequestDispatcher("RegisterForm.html");
				requestDispatcher.include(req, resp);
			}
		} catch (Exception e) {
			e.printStackTrace();
			out.print("<h1 style=\\\"color: red;\\\">Server Busy!</h1>");
			try {
				connnection.rollback();
			} catch (SQLException p) {
				p.printStackTrace();
			}
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	public void destroy() {
		if (connnection != null) {
			try {
				connnection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
