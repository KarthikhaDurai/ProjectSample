package org.mp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

	
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	  @FindBy(id="email")
	    private WebElement txtuser;
	    @FindBy(id="pass")
	    private WebElement txtpass;
	    @FindBy(name="login")
	    private WebElement btnlogin;
	    

	//  ------------------------GETTER-------------
	    public WebElement getTxtuser() {
			return txtuser;
		}
	    public WebElement getTxtpass() {
			return txtpass;
		}
		public WebElement getBtnlogin() {
			return btnlogin;
		}
		public WebElement getusername() {
			// TODO Auto-generated method stub
			return null;
		}
		}
	
	
	
	
	
	

