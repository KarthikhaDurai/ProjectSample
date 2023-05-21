package org.e;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\karth\\eclipse-workspace\\MavenprojectLaunch\\src\\test\\resources\\Book1.xlsx");
		
		FileInputStream fi=new FileInputStream(f);
		
		Workbook w=new XSSFWorkbook(fi);
		Sheet s = w.getSheet("Sheet1");
		
		for(int i=0;i<s.getPhysicalNumberOfRows();i++) {
			Row r = s.getRow(i);
			
			for(int j=0;j<r.getPhysicalNumberOfCells();j++) {
				Cell cell = r.getCell(j);
				System.out.println(cell);
			}
			System.out.println("---------------");
		}
		
		System.out.println("Done");
	}

}
