package grid;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class gridprogram {

	WebDriver driver;
	String Baseurl, nodeurl;
	@BeforeTest
	public void setup() throws MalformedURLException
	{
		Baseurl="https://www.google.com/";
		nodeurl="198.168.1.222";
		DesiredCapabilities capablity=DesiredCapabilities.chrome();
		capablity.setBrowserName("chrome");
		capablity.setPlatform(Platform.WINDOWS);
		driver=new RemoteWebDriver(new URL(nodeurl), capablity);
	}
	public void aftertest()
	{
		driver.quit();
	}
	@Test
	public void simpletest()
	{
		driver.get(Baseurl);
		String a=driver.getTitle();
		System.out.println("title of the page"+a);
	}
}
