package bASIC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
public static void main(String[] args) throws SQLException {
	
	Connection con = null;
try
{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.189:1523:sailodba","apps", 
											"apps");
	
	Statement st = con.createStatement();
	
	String sqlQuery = "delete from SRIVATHS1 where EMPNO = 1001";
	
		int count = st.executeUpdate(sqlQuery);
		
		if ( count >=0);
		{
			System.out.println("records deleted");
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
