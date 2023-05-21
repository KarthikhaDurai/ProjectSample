package org.mp;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
@RunWith(Suite.class)
@SuiteClasses({Login.class,SelectHotel.class,Hotelaselect.class,})
public class RT extends BaseClass {
	@BeforeClass
	public static void beforeclass() {
		ChromeLaunch();
		impwait(20);
		urlLaunch("https://adactinhotelapp.com/");

	}
@AfterClass
public static void afterclass() {
	

}
}
