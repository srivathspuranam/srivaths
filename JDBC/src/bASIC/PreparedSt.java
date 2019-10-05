package bASIC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedSt {
public static void main(String[] args) {
	
	Connection con= null;
	PreparedStatement pst = null;
	
	try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.189:1523:sailodba","apps","apps");
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
	
}
