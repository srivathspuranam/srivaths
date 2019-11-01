package com.stech.excel.test;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelParserLimitedFields {
	
	
	public String parseExcelData(String excelFilePath) throws IOException
	{
		
		File  filePath = new File(excelFilePath);
			
		
		FileInputStream fis =null;		
		StringBuffer buffer =null;
		
		XSSFWorkbook  workBook=null;
		
		try
		{
			fis = new FileInputStream(filePath);
			
			
			workBook = new XSSFWorkbook(fis);
			
			XSSFSheet sheet = workBook.getSheetAt(0);
			
			Iterator<Row> rowIterator = sheet.rowIterator();
			
			buffer = new StringBuffer();
			
			while(rowIterator.hasNext())
			{
				Row nextRow = rowIterator.next();
				
						
				Cell cell = nextRow.getCell(0);				
				int eno = (int)cell.getNumericCellValue();
				
				cell = nextRow.getCell(1);				
				String name = cell.getStringCellValue();
				
				cell = nextRow.getCell(2);				
				double salary = cell.getNumericCellValue();
				
				 cell = nextRow.getCell(3);				
				int dept = (int)cell.getNumericCellValue();
				
				cell = nextRow.getCell(4);				
				String gender = cell.getStringCellValue();
				
				 cell = nextRow.getCell(5);				
				int age = (int)cell.getNumericCellValue();
				
				String record= eno+","+name+","+salary+","+dept+","+gender+","+age;
								
				buffer.append(record+"\n");
			}
			
			workBook.close();
			
			fis.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(workBook!=null)
			{
				workBook.close();
			}
					
			
			if(fis!=null)
			{
				fis.close();
			}
		}
		
		String temp = buffer.toString();
		return temp;
	}

}
