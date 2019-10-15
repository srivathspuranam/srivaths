package assignment2;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Question6 {
public static void main(String[] args) {
	
	Connection con = null;
	Statement st = null;
	
	try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con= DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.189:1523:sailodba","apps","apps");
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	finally
	{
		if (con!=null)
		{
			con.close();
		}
	}
}
}
