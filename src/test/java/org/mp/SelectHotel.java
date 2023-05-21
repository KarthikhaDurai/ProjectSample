package org.mp;

import org.junit.Test;

public class SelectHotel extends BaseClass {
	@Test
	public void hotelsearch() {
	
	POM l=new POM();
	selectbyvisibletext(l.getLocation(), "Los Angeles");
    selectbyvalue(l.getHotels(), "Hotel Sunshine");
	selectbyvalue(l.getRoom(),"Deluxe");
	selectbyvalue(l.getRoomno(), "3");
	sendkeys(l.getDatecheckin(), "14/05/2023");
	sendkeys(l.getDatecheckout(), "16/05/2023");
	selectbyvalue(l.getAdultno(), "3");
	selectbyvalue(l.getChildno(), "0");
	clicck(l.getSearch());
	clicck(l.radiobutton());
	clicck(l.Continue());

}
}
