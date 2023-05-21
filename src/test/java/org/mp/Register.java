package org.mp;

public class Register extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		
	
	POM l=new POM();
	clicck(l.newuser());
	Thread.sleep(2000);

	sendkeys(l.getTxtusername(), "HariniDurai");
	sendkeys(l.getTxtpassword(), "A81N9H");
	sendkeys(l.getTxtconpass(), "A81N9H");
	sendkeys(l.getTxtfullname(), "HariniDurai");
	sendkeys(l.getTxtemail(), "karthikha.s12@gmail.com");
	Thread.sleep(15000);
	clicck(l.getCheckbox());
	click(l.getBtnregister());
}
}