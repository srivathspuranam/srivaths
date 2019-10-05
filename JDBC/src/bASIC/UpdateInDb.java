package bASIC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateInDb {
public static void main(String[] args) throws SQLException {
	
	Connection con = null;
	try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.189:1523:sailodba","apps", 
											"apps");
		Statement st= con.createStatement();
		
		String sqlQuery="update SRIVATHS1 set SALARY=SALARY"
				+ "+ 1000 where COMM = 10";
		
		int count =st.executeUpdate(sqlQuery);
		if(count>=0)
		{
			System.out.println(count+"records updated");
		}
		con.close();
		}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	finally
	{
		if(con!=null);
		{
			con.close();
		}
	}
}
}
