package com.stech.excel.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelParser {
	
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
				
				Iterator<Cell> cellIterator = nextRow.cellIterator();
				
				while(cellIterator.hasNext())
				{
					Cell nextCell = cellIterator.next();
			
					
						switch(nextCell.getCellType())
						{
								case  Cell.CELL_TYPE_NUMERIC:							
									
									buffer.append(nextCell.getNumericCellValue()+",");
										break;							
									
								case  Cell.CELL_TYPE_STRING:	
									
									buffer.append(nextCell.getStringCellValue()+",");
									break;	
												
						}	
					
				}
				
				buffer.setLength(buffer.length()-1);
				buffer.append("\n");
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
