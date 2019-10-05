package bASIC;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertPic {
public static void main(String[] args) {
	
	Connection con = null;
	PreparedStatement pst = null;
	try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	con= DriverManager.getConnection("jdbc:oracle:thin:@192.168.1.189:1523:sailodba","apps","apps");
	
	pst = con.prepareStatement("insert into SRIVATHS1 values(?,?,?,?,?)");
	
	pst.setInt(1, 10);
	pst.setString(2, "abc");
	pst.setInt(3,20);
	pst.setInt(4,15);
		
	FileInputStream fis = new FileInputStream(args[0]);	
	
	pst.setBinaryStream(5, fis, fis.available());		
	
	int i = pst.executeUpdate();		
	
	System.out.println (i + " records affected");
	
	con.close();			
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
