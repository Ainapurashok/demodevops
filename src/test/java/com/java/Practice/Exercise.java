package com.java.Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exercise {
	/*1. Reverse String/Palindrome/loop/builder
	2. Duplicate Word/character/reverse word
	3. Read values from excel 
	4. Prime/even Odd/Fibonaci
	5. Maximum/Second Maximum
	6. Apeend
	7. Hasmpa
	8.Arraylist
	*/

	public static void main (String args[]) throws IOException{
		
		File fl=new File("C:\\BronteQE\\Bronte_Branch\\Pearson_Bronte\\src\\test\\resources\\Book1.xlsx");
		FileInputStream input=new FileInputStream(fl);
		XSSFWorkbook wb = new XSSFWorkbook(input);
		  XSSFSheet sheet = wb.getSheetAt(0);
	      
	 
		   int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
		   
		   for(int i=0;i<rowCount;i++){
			    int  clmn = sheet.getRow(i).getLastCellNum();
			     for(int j=1;j<clmn;j++){
			   double cellvalue = sheet.getRow(i).getCell(j).getNumericCellValue();
			    System.out.println(cellvalue);
			    
			    
			     }
		   }
		
		  
		 
}}
