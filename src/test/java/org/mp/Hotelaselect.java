package org.mp;

import org.junit.Test;

public class Hotelaselect extends BaseClass{
@Test
public void selecthotel() {
	
	POM l=new POM();
	sendkeys(l.getFirstname(), "Harini");
	sendkeys(l.getLastname(), "Durai");
	sendkeys(l.getaddress(), "4,pillaiyar kovil 1st Street,akkarai,Chennai-600119");
	sendkeys(l.getCardno(), "8778544342343448");
	selectbyvalue(l.getCardtype(), "OTHR");
	selectbyvalue(l.getExpmonth(), "5");
	selectbyvalue(l.getExpyear(), "2024");
	sendkeys(l.getCardcvno(), "987");
	clicck(l.getBookbtn());
	clicck(l.getbookeditinerary());
	sendkeys(l.getorderid(),"G75WJ6NEQ2");
	clicck(l.getorderbtn());

}
}

