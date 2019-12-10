package com.pro.cont;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pro.user.Users;

public class RegisterController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();
			String id = request.getParameter("id");
			String name = request.getParameter("name");
			String passwd = request.getParameter("passwd");
			String gender = request.getParameter("gender");
			String date = request.getParameter("date");
			String role = request.getParameter("role");
			
			Users user = new Users(id, name, passwd, gender, date, role);

			try {
				RegisterService registerService = new RegisterService();
				boolean result = registerService.register(user);
				out.println("<html>");
				out.println("<head>");
				out.println("<title>Registration Successful</title>");
				out.println("</head>");
				out.println("<body>");
				out.println("<center>");
				if (result) {
					out.println("<h1>Thanks for Registering with us :</h1>");
					out.println("To login with new UserId and Password<a href=login.jsp>Click here</a>");
				} else {
					out.println("<h1>Registration Failed</h1>");
					out.println("To try again<a href=register.jsp>Click here</a>");
				}
				out.println("</center>");
				out.println("</body>");
				out.println("</html>");
			} finally {
				out.close();
			}

		}
	}

}
