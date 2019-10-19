package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {

	private static final long serialVersionUID = 1L;	

		@Override
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		{
			// TODO Auto-generated method stub
			doPost(request, response);
		}
		
		@Override
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
		{
			// TODO Auto-generated method stub
	
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();

			String userId=request.getParameter("uid");
			String password=request.getParameter("pwd");

			if(userId.equalsIgnoreCase("vaths") && password.equals("serv123"))
			{
				out.println("<H1>Welcome to User : "+userId+"</H1>");
			}
			else	
			{
				out.println("<H1>Invalid Userid and password : "+userId+"</H1>");
			}
		}
	
	}

