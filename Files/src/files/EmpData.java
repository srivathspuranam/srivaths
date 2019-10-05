package files;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class EmpData {
public static void main(String[] args) throws IOException {
	
	if (args.length!=1)
	{
		System.out.println("invalid syntax,Usage:EmpDataFilter<empdata_file>");
		System.exit(0);
	}
	File file = new File(args[0]);
	
	String fileName= file.getName();
	
	if(!fileName.equalsIgnoreCase("empdata.txt"))
	{
		System.out.println("invalid file and missing data file");
		System.exit(0);
	}
	FileInputStream fis=null;
	DataInputStream dis=null;
	
	try
	{
		fis = new FileInputStream(file);
		dis = new DataInputStream(fis);
		
		String record = dis.readLine();
		
		while(record!=null && !record.isEmpty() )
		{
			String[] fields = record.split(":");
			String result= fields[0]+":"+fields[1]+":"+fields[4];

			System.out.println(result);
			
			record=dis.readLine();
		}
		dis.close();
		fis.close();
		
	}
	catch (Exception e)
	{
		e.printStackTrace();
				}
 finally 
 {
		if(dis!=null)
		{
			dis.close();
		}
		if(fis!=null)
		{
			fis.close();
		}
}
}
}