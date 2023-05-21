package org.mp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPageReg extends BaseClass{
	public static void main(String[] args) {
		ChromeLaunch();	
		urlLaunch("https://www.facebook.com/");
		impwait(10);
	    WebElement btnlogin = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
	    clicck(btnlogin);
	    WebElement frtname = driver.findElement(By.name("firstname"));	
		sendkeys(frtname, "Harini");
		WebElement lastname = driver.findElement(By.name("lastname"));
		sendkeys(lastname, "Durai");
		WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		sendkeys(email, "karthikhadurai@gmail.com");
		WebElement enteremail = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
		sendkeys(enteremail, "karthikhadurai@gmail.com");
	    WebElement txtpass = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		sendkeys(txtpass,"7299466526");
		WebElement btn = driver.findElement(By.name("websubmit"));
		clicck(btn);
	}

}
