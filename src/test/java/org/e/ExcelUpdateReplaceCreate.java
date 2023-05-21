package org.e;
import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUpdateReplaceCreate {
	public static void main(String[] args) throws IOException {
//		------UPDATE--->GET SHEET,ROW,CREATE CELL--->SET---->OUTPUT
//		File f=new File("C:\\Users\\karth\\eclipse-workspace\\MavenprojectLaunch\\src\\test\\resources\\Book1.xlsx");
//		FileInputStream fi=new FileInputStream(f);
//		Workbook w=new XSSFWorkbook(fi);
//		Sheet s = w.getSheet("Sheet1");
//		Row r = s.getRow(1);
//		Cell cell = r.createCell(1);
//		cell.setCellValue("Durai");
//		FileOutputStream fo=new FileOutputStream(f);
//		w.write(fo);
//		System.out.println("---Done---");
//		-------CREATE---->EXCEL,SHEET,ROW,CELL-->SET----------------
//		File f=new File("C:\\Users\\karth\\eclipse-workspace\\MavenprojectLaunch\\src\\test\\resources\\Book1.xlsx");
//		FileInputStream fi=new FileInputStream(f);
//		Workbook w=new XSSFWorkbook(fi);
//		Sheet s = w.getSheet("Sheet1");
//		Row r = s.getRow(1);
//		Cell cell = r.createCell(1);
//		cell.setCellValue("Harini");
//		FileOutputStream fo=new FileOutputStream(f);
//		w.write(fo);
//		System.out.println("---Done---");
//		------REPLACE------->GET SHEET,ROW,GET CELL(IF CONDITION)--->SET--->OUTPUT
		File f=new File("C:\\Users\\karth\\eclipse-workspace\\MavenprojectLaunch\\src\\test\\resources\\Book1.xlsx");
		FileInputStream fi=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fi);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(1);
		Cell cell = r.getCell(1);
		
		String s1 = cell.toString();
		String s2 = cell.getStringCellValue();
		
		if (s1.equals("Durai")) {
			cell.setCellValue("Sharmiladevi");
			
		}
		FileOutputStream fo=new FileOutputStream(f);
		w.write(fo);
		
		System.out.println("---Done---");
		
	}

}
