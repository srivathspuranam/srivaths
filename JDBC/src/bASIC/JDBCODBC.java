package bASIC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCODBC {

	public static void main(String[] args) {
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.189:1523:sailodba","apps", 
											"apps");
			
			Statement st = con.createStatement();
			String sqlQuery= "select * from SRIVATHS1";
			
			ResultSet rs = st.executeQuery(sqlQuery);
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+
						rs.getString(2)+"\t"+
						
						rs.getInt(3)+"\t"+
					
						rs.getInt(4));
				
			}
			con.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
