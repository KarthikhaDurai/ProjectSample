package org.e;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BaseExcel {

	public static String excelread(String filename, String Sheetname, int row, int cel) {

		File f = new File(
				System.getProperty("user.dir")+"\\src\\test\\resources\\" + filename + ".xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet s = w.getSheet(Sheetname);
		Row r = s.getRow(row);
		Cell cell = r.getCell(cel);

		int type = cell.getCellType();

		// TYPE 1 STRING
		// TYPE 0 NUMBER,DATE
		String value = null;
		if (type == 1) {
			value = cell.getStringCellValue();

		} else {
			if (DateUtil.isCellDateFormatted(cell)) {
				Date d = cell.getDateCellValue();
				SimpleDateFormat ss = new SimpleDateFormat("dd-MMM-yyyy");
				value = ss.format(d);

			} else {
				double db = cell.getNumericCellValue();
				long ln = (long) db;
				value = String.valueOf(ln);

			}

		}
		return value;

	}
}


