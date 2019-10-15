package com.stech.mnrao.xml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class LoadRecordsIntoDatabase {
	
	
	public void loadRecordsIntoDatabase(String [] records)
	{
		Connection con=null;
	try
	{
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott","tiger");
		
		PreparedStatement pst = con.prepareStatement("insert into employee values(?,?,?,?,?,?)");
		
		for(String record : records)
		{
			String[] fields = record.split(",");
			pst.setInt(1, Integer.parseInt(fields[0]));			
			pst.setString(2, fields[1]);
			pst.setDouble(3, Double.parseDouble(fields[2]));
			pst.setInt(4, Integer.parseInt(fields[3]));
			pst.setString(5, fields[4]);
			pst.setInt(6, Integer.parseInt(fields[5]));			
			
			pst.addBatch();
		}
			pst.executeBatch();				
			con.close();
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
		
		
	}
	

}
