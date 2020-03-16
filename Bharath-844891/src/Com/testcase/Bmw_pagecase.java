package Com.testcase;


import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Com.baseclass.Base;
import Com.pages.Bmw_page;




public class Bmw_pagecase extends Base{
	@BeforeClass
	public void bc()
	{
		LaunchApplication("chrome","https://www.bmw.in/en/");
	}
	@Test
	public void tc() throws InterruptedException, IOException
	{
		Bmw_page a1=new Bmw_page(driver);
		a1.clcikbmw();
		screenshot("Screenshot\\BMW.png");
	}
	@AfterClass
	public void ac()
	{
		close();
	}
}
