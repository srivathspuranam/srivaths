package com.sailo.web.welcome;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		HttpSession session = req.getSession(false);
		session.invalidate();
		out.print(" <h3 style=\"text-align: center;\">You've been logged out successfully. Please login to access the MENU</h3>");
		out.print("<hr>");
		RequestDispatcher loginRequestDispatcher = req.getRequestDispatcher("LoginForm.html");
		loginRequestDispatcher.include(req, resp);
	}

}
