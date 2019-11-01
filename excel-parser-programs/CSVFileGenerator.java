package com.stech.excel.test;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class CSVFileGenerator {

	public void generateCSVFile(String[] records, String csvFilePath) throws IOException {
		
		File filePath = new File(csvFilePath);
		
		FileOutputStream fos=null;
		DataOutputStream dos=null;
		
		try
		{
			fos = new FileOutputStream(filePath);
			dos = new DataOutputStream(fos);
			
			for(String record:records)
			{
				dos.writeBytes(record+"\n");
			}
			dos.close();
			fos.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(dos!=null)
			{
				dos.close();
			}
			if(fos!=null)
			{
				fos.close();
			}
		}
		
		
	}

}
