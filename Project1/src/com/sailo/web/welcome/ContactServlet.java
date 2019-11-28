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
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ContactServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
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
			statement = connection.prepareStatement("SELECT * FROM EMPLOYEES");

			ResultSet result = statement.executeQuery();
			out.print("<style>\r\n" + "    table, th, td {\r\n"
					+ "      border: 1px solid black;margin-left: 550px;\r\n" + "    }\r\n" + "    </style>");
			out.print("<table width: 200%;\">\r\n" + "<tr>\r\n" + "	<th>Name</th>\r\n" + "<th>Date Of Birth</th>\r\n"
					+ "<th>Gender</th>\r\n" + "	<th>Department</th>\r\n" + "<th>Role</th>\r\n" + "</tr>");
			while (result.next()) {
				String Name = result.getString(1);
				String DOB = result.getString(3);
				String gender = result.getString(4);
				String dept = result.getString(5);
				String role = result.getString(6);
				out.print("<tr>");
				out.print("<td style=\"text-align: center;\">" + Name + "</td>");
				out.print("<td style=\"text-align: center;\">" + DOB + "</td>");
				out.print("<td style=\"text-align: center;\">" + gender + "</td>");
				out.print("<td style=\"text-align: center;\">" + dept + "</td>");
				out.print("<td style=\"text-align: center;\">" + role + "</td>");
				out.print("</tr>");
			}
			out.print("</table>");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
