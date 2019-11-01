package com.stech.excel.test;

import java.io.IOException;

public class ExcelTest {
	
	public static void main(String[] args) throws IOException {
		
		String excelFilePath = args[0];	
		String csvFilePath = args[1];
		
		ExcelParser  parser = new ExcelParser();
		
		String excelData = parser.parseExcelData(excelFilePath);
		
		String[] records = excelData.split("\n");
		
		CSVFileGenerator  csvGenerator = new CSVFileGenerator();
		
		csvGenerator.generateCSVFile(records,csvFilePath);
		
		System.out.println("CSV File Generated Successfully");
		
	}

}
