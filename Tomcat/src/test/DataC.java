package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.VoidType;

public class DataC extends HttpServlet
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Connection con = null;

	PreparedStatement pst = null;

	@Override
	public void init() throws ServletException {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.189:1523:sailodba","apps", "apps");			
			con.setAutoCommit(false);

			pst = con.prepareStatement("insert into srivaths3 values(?,?,?,?,?,?)");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

	try
	{
		String userId = request.getParameter("uid");
		String password = request.getParameter("pwd");
		String retypePassword = request.getParameter("rpwd");
		String firstName = request.getParameter("first_name");
		String lastName = request.getParameter("second_name");
	    String gender = request.getParameter("gender");
	    String date = request.getParameter("DOB");
		
		if(!password.equalsIgnoreCase(retypePassword))
		{
			out.println("<h1>retype not matched</h1>");
			return;
		}
		
		pst.setString(1, userId);
		pst.setString(2, password);
		pst.setString(3, firstName);
		pst.setString(4, lastName);
		pst.setString(5, gender);
		pst.setString(6, date);
		
		pst.executeUpdate();
		
		out.println("<h1>Successfully Register</h1>");
		
		con.commit();
		
	}
	catch(Exception e)
	{
		e.printStackTrace();		
		out.println("<h1>Server busy</h1>");
		try {
			con.rollback();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

@Override
	public void destroy() {
		
		try
		{
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}

