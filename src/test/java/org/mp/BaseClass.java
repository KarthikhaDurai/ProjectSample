package org.mp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice.Return;
public class BaseClass {
	 public static WebDriver driver; 

	 public static void ChromeLaunch(){
	 	WebDriverManager.chromedriver().setup();
	 	ChromeOptions op=new ChromeOptions();
	 	op.addArguments("--remote-allow-origins=*");
	 	 driver = new ChromeDriver (op);
	 	 
	 }

	 public static void urlLaunch(String data) {
	 	driver.get(data);
	 	
	 }

	 public static void impwait(int sec) {
	 	
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));

	 }
	 public static  void quit( ) {
		quit();
	}
//	 --------------------ACTIONS-------------------
	 public static void movetoElement(WebElement target) {
		Actions a =new Actions(driver);
          a.click(target).perform();

	}
	 public static void draganddrop(WebElement from,WebElement To) {
			Actions a =new Actions(driver);
             a.dragAndDrop(from, To).perform();

		}
	 public static void contextclick (WebElement target){
			Actions a =new Actions(driver);
              a.contextClick(target).perform();

		}
	 public static void clickandhold (WebElement target){
			Actions a =new Actions(driver);
              a.clickAndHold(target).perform();

		}
	 public static void release (WebElement target){
			Actions a =new Actions(driver);
              a.release(target).perform();
              
	 }
//	 -------------------ALERT---------------------
	 public static void simplealert() {
		driver.switchTo().alert().accept();

	}
	 public static void confirmalert(String conalert) {
		
		switch (conalert) {
		case"accept":
			driver.switchTo().alert().accept();
			break;

		case "dismiss":
			driver.switchTo().alert().dismiss();
			break;
		}

	}
	 public static void promptalert(String text) {
	Alert a = driver.switchTo().alert();
	a.sendKeys(text);
	a.accept();

	}
	 
//	 ---------------------DROPANDDOWN-----------------------------
	 public static void selectbyindex(WebElement e, int data) {
		Select s=new Select(e);
      s.selectByIndex(data);
	}
	 public static void selectbyvalue(WebElement e, String data) {
			Select s=new Select(e);
	      s.selectByValue(data);
		}
	 public static void selectbyvisibletext(WebElement e, String data) {
			Select s=new Select(e);
	     s.selectByVisibleText(data);
	     
		}
	 public static void getoption(WebElement e, String data) {
		 Select s=new Select(e);
		 List<WebElement> options = s.getOptions();
		 System.out.println("--------NORMALLOOP------");
		 for (int i = 0; i < options.size(); i++) {
			WebElement we = options.get(i);
			String ss = we.getText();
			System.out.println(ss);
		}

	}
	 public static void getallselectedoptions(WebElement e, String data) {
		 Select s=new Select(e);
		 List<WebElement> allsel = s.getAllSelectedOptions();
		 for(int i=0;i<allsel.size();i++) {
			 WebElement we = allsel.get(i);
			 String se = we.getText();
			 System.out.println(se);
		 }
	}
	 public static void getfirstselectedoptions(WebElement e, String data) {
		 Select s=new Select(e);
		 WebElement f = s.getFirstSelectedOption();
		 String ss = f.getText();
		 System.out.println(ss);

	}
	 public static void ismultiple(WebElement e, String data) {
		 Select s=new Select(e);
         boolean m = s.isMultiple();
         System.out.println(m);
         List<WebElement> options = s.getOptions();
         System.out.println("-----GETALLOPTIONS------");
         for(WebElement x:options) {
        	
        	 System.out.println(x);
         }
	}
	 public static void deselectby(WebElement e, int data) {
			Select s=new Select(e);
	      s.deselectByIndex(data);
		}
		 public static void deselectbyvalue(WebElement e, String data) {
				Select s=new Select(e);
		      s.deselectByValue(data);
			}
		 public static void deselectbyvisibletext(WebElement e, String data) {
				Select s=new Select(e);
		     s.deselectByVisibleText(data);
		     }
//		 ------------FRAMES-----------------
		 public static void frames(WebElement target) {
		driver.switchTo().frame(target);

		}
		 public static void frames(WebElement e,int data) {
				driver.switchTo().frame(data);

				}
		 public static void frames(WebElement e,String data) {
				driver.switchTo().frame(data);

				}

//		 -----------------------NAVIGATION COMMANDS-------------
		 public static void refresh() {
			driver.navigate().refresh();

		}
		 public static void backward() {
			 driver.navigate().back();

		}
		 public static  void forward() {
			 driver.navigate().forward();

		}
		 public static void reload(String url) {
			 driver.navigate().to(url);

		}
//		 -------------------TAKESSCREENSHOT----------
		 public static void Screenshot(String Filename) throws IOException {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File s = ts.getScreenshotAs(OutputType.FILE);
            System.out.println(s);
            File f=new File(System.getProperty("user.dir"+ "\\src\\test\\resources\\"+Filename+".xlsx"));
            FileUtils.copyFile(s, f);
		}
//-----------------------JAVASCRIPTEXECUTOR-------------------
		 public static  void Sendkeys(WebElement e,String giventext) {
			 JavascriptExecutor js=(JavascriptExecutor)driver;
			 js.executeScript("arguments[0].setAttribute('value',"+giventext+")", e);
			
		}
		 public static void click(WebElement e) {
			 JavascriptExecutor js=(JavascriptExecutor)driver;
			 js.executeScript("argument[0].click", e);
			 
		}
		 public void getattribute(WebElement e,String giventext) {
			 JavascriptExecutor js=(JavascriptExecutor)driver;
             js.executeScript("Return argument[0].getAttribute('value',"+giventext+")", e);
		}
		 
		 public void scrollupanddown(WebElement e,String giventext) {
			 JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("argument[0].scrollIntoView",e);
		}
//		 ----------------WINDOWSHANDLING------
		 public static void windowshandling(int windowcount) {
		Set<String> ALLId = driver.getWindowHandles();
		int count=1;
		for (String eachId : ALLId) {
			if (count==windowcount) {
				driver.switchTo().window(eachId);
			}
			count++;
		}
   
		}
//--------------------POM-----------------------

	 public static void sendkeys(WebElement e,String data) {
	 	e.sendKeys(data);
	 }
	 public static void clicck(WebElement e) {
	 	e.click();
	 }
	 public static String getCurrenturl() {
	 	String url=driver.getCurrentUrl();
	 	return url;
}
	 public static  String getattributemethod(WebElement e,String value) {
		String attribute = e.getAttribute(value);
		return attribute;

	}
	 public static String gettext(WebElement e) {
	String text = e.getText();
	return text;

	}
//	 ----------------------EXCEL------------------------
	 public static void excel(String filename, String Sheetname, int row, int cel) throws IOException {
		 File f = new File(
					System.getProperty("user.dir")+"\\src\\test\\resources\\" + filename + ".xlsx");
			Workbook w = new XSSFWorkbook();
			Sheet s = w.getSheet(Sheetname);
			Row r = s.getRow(row);
			Cell cell = r.getCell(cel);
            System.out.println(cel);
			int type = cell.getCellType();
             System.out.println(type);
			// TYPE 1 STRING
			// TYPE 0 NUMBER,DATE
			String value = null;
			if (type == 1) {
				value = cell.getStringCellValue();
              System.out.println(value);
			} else {
				if (DateUtil.isCellDateFormatted(cell)) {
					Date d = cell.getDateCellValue();
					SimpleDateFormat ss = new SimpleDateFormat("dd-MMM-yyyy");
					value = ss.format(d);
                    System.out.println(value);
				} else {
					double db = cell.getNumericCellValue();
					long ln = (long) db;
				 value = String.valueOf(ln);
					System.out.println(value);

				}

			}
			return;

		}
	
}


