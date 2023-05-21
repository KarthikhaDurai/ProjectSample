package org.e;
import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelWrite {
	public static void main(String[] args) throws IOException {
		File f=new File("C:\\Users\\karth\\eclipse-workspace\\MavenprojectLaunch\\src\\test\\resources\\Book1.xlsx");
		FileInputStream fi=new FileInputStream(f);
		Workbook w=new XSSFWorkbook(fi);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(1);
		Cell cell = r.getCell(2);
		System.out.println(cell);
		
		int type = cell.getCellType();
		System.out.println(type);
		// TYPE 1 STRING
		//TYPE 0 NUMBER,DATE
		if(type==1) {
			String value = cell.getStringCellValue();
			System.out.println(value);
		}else {
			if(DateUtil.isCellDateFormatted(cell)) {
				Date d = cell.getDateCellValue();
				SimpleDateFormat ss=new SimpleDateFormat("dd-MMM-yyyy");
				String value = ss.format(d);
				System.out.println(value);
				
			}else {
				double db = cell.getNumericCellValue();
				long ln=(long)db;
				String value = String.valueOf(ln);
				System.out.println(value);
			}
		}
	}

}
