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
		
		Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE );			
		String sqlQuery="select * from SRIVATHS1";		
		
		ResultSet rs = st.executeQuery(sqlQuery);	
		
		if(rs.first())
		{
			System.out.println("fisrt record id : "+rs.getInt(1));
		}			
		if(rs.absolute(3))
		{
			System.out.println("fifth record id : "+rs.getInt(1));
		}			
		if(rs.relative(-2))
		{
			System.out.println("third record id : "+rs.getInt(1));
		}			
		if(rs.relative(5))
		{
			System.out.println("seventh record id : "+rs.getInt(1));
		}
		if(rs.last())
		{
			System.out.println("last record id : "+rs.getInt(1));
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
