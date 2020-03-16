package Com.testcase;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Com.baseclass.base;
import Com.pages.currency;

public class testcurrency extends base {
	
	@BeforeClass
	public void launch()
	{
		launchapplication("chrome","https://www.phptravels.net/public/amadeus/offers/");
	}
	
	@Test
	public void test1()
	{
		currency a=new currency(driver);
		a.changecurrency();
	}
	
	@AfterClass
	public void after() throws IOException
	{
		screenshot("C:\\Users\\BLTuser.BLT1222\\Desktop\\scr\\ggsdjhgs.jpg");
	}
	

}
