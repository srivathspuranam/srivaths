package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.xpath.internal.operations.NotEquals;

public class ServletConfig extends HttpServlet
{
private static final long serialversionUID = 1L;

Connection con = null;
PreparedStatement pst = null;

public void init() throws ServletException{
	
	try {
		javax.servlet.ServletConfig config =getServletConfig();
		String jdbcDriver = config.getInitParameter("driver");
		String dbHost = config.getInitParameter("dbHost");
		String dbPortNum = config.getInitParameter("port");
		String dbsid = config.getInitParameter("sid");
		String userId = config.getInitParameter("uid");
		String password = config.getInitParameter("pwd");	
		
		Class.forName(jdbcDriver);
		
		con= DriverManager.getConnection("jdbc:oracle:thin:@"+dbHost+":"+dbPortNum+":"+dbsid,userId,password);
		con.setAutoCommit(false);
		
		pst=con.prepareStatement("insert into srivaths3 values(?,?,?,?,?,?)");
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}

 @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	 response.setContentType("text/html");
	 
	 PrintWriter out = response.getWriter();
	 
	 try
	 {
		 String userId = request.getParameter("uid");
		 String password = request.getParameter("pwd");
		 String retypepassword = request.getParameter("rpwd");
		 String firstname = request.getParameter("firstname");
		 String lastname = request.getParameter("lastname");
		 String date = request.getParameter("birthdate");
		 String gender = request.getParameter("gender");
		 
		 if(!password.equalsIgnoreCase(retypepassword));
		 {
			 out.println("<h1>password not matchd</h1>");
			 return;
		 }
		 
		 
		 
		 
		 
		 
		 
	}
	catch(Exception e)
	 {
		e.printStackTrace();
	 }
}



















}
