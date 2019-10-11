package com.stech.mnrao.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;


public class PreparedStatementTest {
	
	public static void main(String[] args) throws SQLException {
		
		Connection con=null;
		Statement st=null;
		Savepoint sp1=null;
		Savepoint sp2=null;
		Savepoint sp3=null;
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott","tiger");
		
			con.setAutoCommit(false);
			
			 st = con.createStatement();
		}
		catch(Exception e)
		{
			e.printStackTrace();			
		}
		
		
		try
		{		
			sp1 = con.setSavepoint("sp1");
			st.executeUpdate("INSERT INTO EMPLOYEE VALUES(1001,'hello1',5000,10,'male',25)");
			
			st.executeUpdate("INSERT INTO EMPLOYEE VALUES(1002,'hello2',6000,20,'female',25)");
			
			st.executeUpdate("INSERT INTO EMPLOYEE VALUES(1003,'hello3',8000,30,'male',26)");
				
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			con.rollback(sp1);
		}
			
		try
		{
			sp2 = con.setSavepoint("sp2");
			st.executeUpdate("INSERT INTO EMPLOYEE VALUES(1004,'hello1',5000,10,'male',25)");
			
			st.executeUpdate("INSERT INTO EMPLOYEE VALUES(1005,'hello2',6000,20,'female',25)");
			
			st.executeUpdate("INSERT INTO EMPLOYEE VALUES(xyz,'hello3',8000,30,'male',26)");
			
			
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
			con.rollback(sp2);
		}
		
		try
		{
			sp3 = con.setSavepoint("sp3");
			st.executeUpdate("INSERT INTO EMPLOYEE VALUES(1007,'hello1',5000,10,'male',25)");
			
			st.executeUpdate("INSERT INTO EMPLOYEE VALUES(1008,'hello2',6000,20,'female',25)");
			
			st.executeUpdate("INSERT INTO EMPLOYEE VALUES(1009,'hello3',8000,30,'male',26)");
			
			con.commit();
			System.out.println("Inserted ");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			con.rollback(sp3);
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
