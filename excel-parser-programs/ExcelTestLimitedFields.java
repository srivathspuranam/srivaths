package com.stech.excel.test;

import java.io.IOException;



public class ExcelTestLimitedFields {
	
	public static void main(String[] args) throws IOException {
		
		String excelFilePath = args[0];	
		String csvFilePath = args[1];
		
		ExcelParserLimitedFields  parser = new ExcelParserLimitedFields();
		
		String excelData = parser.parseExcelData(excelFilePath);
		
		String[] records = excelData.split("\n");
		
		CSVFileGenerator  csvGenerator = new CSVFileGenerator();
		
		csvGenerator.generateCSVFile(records,csvFilePath);
		
		System.out.println("CSV File Generated Successfully");
		
	}

}
