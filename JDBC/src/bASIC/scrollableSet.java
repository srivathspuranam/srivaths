package bASIC;
//scrollable result set

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class scrollableSet {
public static void main(String[] args) throws SQLException {
	Connection con = null;
	
	try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.189:1523:sailodba","apps", 
												"apps");
		
		Statement st = con.createStatement( );			
		String sqlQuery="select * from SRIVATHS1";		
		
		ResultSet rs = st.executeQuery(sqlQuery);	
		while(rs.next()) {
			System.out.println("FIRST");
		}
				con.close();				

	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	finally
	{
		if(con!=null)
		{
			con.close();
		}
	}
}
}
