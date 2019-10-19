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

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.VoidType;

public class DataC extends HttpServlet
{
 Connection con = null;
 PreparedStatement pst = null;
 @Override
	public void init() throws ServletException {
	
	try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.189:1523:sailodba","apps","apps");
		con.setAutoCommit(false);

		pst = con.prepareStatement("insert into track_user values(?,?,?,?,?,?)");
	
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
 }
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();
	try
	{
		String user_id=request.getParameter("uid");
		String password= request.getParameter("pwd");
		String retype_password=request.getParameter("rpwd");
		String first_name= request.getParameter("first name");
		String second_name= request.getParameter("second name");
		String gender = request.getParameter("gender");
		String birth = request.getParameter("DOB");
		
		if(!password.equalsIgnoreCase(retype_password))
		{
			out.println("<h1>password not matched</h1>");
			return;
		}
		pst.setString(parameterIndex, x);
	}
catch(Exception e)
	{
	e.printStackTrace();
	}
	
	
	
	
	{
		if(con!=null)
		{
			con.close();
		}
	}
	}
}

