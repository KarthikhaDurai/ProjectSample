package org.mp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Browserlaunch extends BaseClass{
	public static void main(String[] args) {

		ChromeLaunch();	
			urlLaunch("https://www.facebook.com/");
			impwait(10);
			
			WebElement txtuser = driver.findElement(By.id("email"));
		    sendkeys(txtuser,"Harini");
		    WebElement txtpass = driver.findElement(By.id("pass"));
		    sendkeys(txtpass,"0406");
		   WebElement btnlogin = driver.findElement(By.name("login"));
		   clicck(btnlogin);
		   
		   //driver.quit();
		}

}
