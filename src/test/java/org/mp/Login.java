package org.mp;

import org.junit.Test;

public class Login extends BaseClass {
	@Test
	public void loginada() {
		

	
		
		POM l=new POM();
	sendkeys(l.getTxtuser(), "HariniDurai");
	sendkeys(l.getTxtpass(), "A81N9H");
	clicck(l.getBtnlogin());
}
}