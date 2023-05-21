package org.mp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSample extends BaseClass{
	 public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		 	ChromeOptions op=new ChromeOptions();
		 	op.addArguments("--remote-allow-origins=*");
		 	 driver = new ChromeDriver (op);
		 	 
		 driver.get("https://adactinhotelapp.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		
		
//	  WebElement btncreate = driver.findElement(By.className("login_register"));
//		btncreate.click();
//		
//		WebElement txtuser = driver.findElement(By.name("username"));
//		sendkeys(txtuser, "HariniDurai");
//		WebElement txtpass = driver.findElement(By.id("password"));
//		sendkeys(txtpass, "Harini0406");
//		WebElement repass = driver.findElement(By.id("re_password"));
//		sendkeys(repass, "Harini0406");
//		WebElement name = driver.findElement(By.name("full_name"));
//		sendkeys(name, "HariniDurai");
//		WebElement email = driver.findElement(By.id("email_add"));
//		sendkeys(email, "karthikha.s12@gmail.com");
//		Thread.sleep(15000);
		
//		WebElement clk = driver.findElement(By.id("tnc_box"));
//		clk.click();
//		WebElement reg = driver.findElement(By.id("Submit"));
//		reg.click();
//		WebElement ln = driver.findElement(By.xpath("//a[text()='Click here to login']"));
//		ln.click();
		
		WebElement txtuser = driver.findElement(By.id("username"));
		sendkeys(txtuser, "HariniDurai");
		WebElement txtpass = driver.findElement(By.id("password"));
		sendkeys(txtpass, "A81N9H");
		WebElement btn = driver.findElement(By.name("login"));
		btn.click();
		 WebElement loc = driver.findElement(By.name("location"));
		Select s=new Select(loc);
		s.selectByVisibleText("Los Angeles");
		 WebElement h = driver.findElement(By.name("hotels"));
			Select s1=new Select(h);
			s1.selectByValue("Hotel Sunshine");
			WebElement room = driver.findElement(By.id("room_type"));
			Select s2=new Select(room);
			s2.selectByValue("Deluxe");
			WebElement noroom = driver.findElement(By.id("room_nos"));
			Select s3=new Select(noroom);
			s3.selectByValue("3");
			
			
			
			WebElement checkin = driver.findElement(By.id("datepick_in"));
			JavascriptExecutor Js=(JavascriptExecutor)driver;
			Js.executeScript("arguments[0].setAttribute('value','11/05/2023')", checkin);
	        checkin.sendKeys("14/05/2023");
	        
	        WebElement checkout = driver.findElement(By.name("datepick_out"));
	        JavascriptExecutor Jk=(JavascriptExecutor)driver;
			Jk.executeScript("arguments[0].setAttribute('value','12/05/2023')", checkout);
	        checkout.sendKeys("16/05/2023");
	        
	        
			WebElement Ar = driver.findElement(By.id("adult_room"));
			Select s5=new Select(Ar);
			s5.selectByValue("3");
			WebElement cr = driver.findElement(By.id("child_room"));
			Select s6=new Select(cr);
			s6.selectByValue("0");
			
			WebElement btnclk = driver.findElement(By.id("Submit"));
			btnclk.click();
			WebElement rb = driver.findElement(By.name("radiobutton_0"));
			rb.click();
			WebElement con = driver.findElement(By.xpath("//input[@value='Continue']"));
			con.click();
			
			WebElement fn = driver.findElement(By.name("first_name"));
			sendkeys(fn, "Harini");
			WebElement ln1 = driver.findElement(By.id("last_name"));
			sendkeys(ln1, "Durai");
			WebElement add = driver.findElement(By.name("address"));
			sendkeys(add, "4,pillaiyar kovil 1st Street,akkarai,Chennai-600119");
			WebElement cardno = driver.findElement(By.name("cc_num"));
			sendkeys(cardno, "8778544342343448");
			WebElement cardtype = driver.findElement(By.name("cc_type"));
			Select s7=new Select(cardtype);
			s7.selectByValue("OTHR");
			WebElement mon = driver.findElement(By.id("cc_exp_month"));
			Select s8=new Select(mon);
			s8.selectByValue("5");
			WebElement yr = driver.findElement(By.id("cc_exp_year"));
			Select s9=new Select(yr);
			s9.selectByValue("2024");
			WebElement ccvno = driver.findElement(By.id("cc_cvv"));
			sendkeys(ccvno, "987");
			WebElement booknow = driver.findElement(By.name("book_now"));
			booknow.click();
			WebElement mi = driver.findElement(By.xpath("//a[text()='Booked Itinerary']"));
			mi.click();
			WebElement userorderid = driver.findElement(By.name("order_id_text"));
			userorderid.sendKeys("G75WJ6NEQ2");
			WebElement btnck = driver.findElement(By.xpath("//input[@value='867670']"));
			btnck.click();
			
	}
	}


