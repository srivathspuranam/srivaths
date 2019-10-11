package assignment2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Question1 {
	public static void main(String[] args) {
		
		Connection con = null;
		
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		con=DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.189:1523:sailodba", "apps","apps");
		PreparedStatement ps = con.prepareStatement("select * from SRIVATHS1");
		ResultSet rs = ps.executeQuery();
		ArrayList<String> c = new ArrayList<String>();
		while(rs.next())
		{
			String s1= (rs.getInt(1) + ":" + rs.getString(2) + ":" + rs.getInt(3) + ":" + rs.getInt(4));
	        c.add(s1);
	        c.add('\n', s1);
		}
				
		
	
		System.out.println(c);
		
			
	
		}
		catch( Exception e)
		{
			e.printStackTrace();
		}
	}
}
