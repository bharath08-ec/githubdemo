package Com.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
protected WebDriver driver;
public void launchapplication(String browser,String url)
{
	try
	{
	if(browser.equalsIgnoreCase("FireFoxDriver"))
	{
		//System.setProperty("webdriver.gicko.driver","");
		driver = new FirefoxDriver();
	}
	else if (browser.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT1222\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get(url);
}

	catch (Exception e)
	{
		System.out.println("browser cant be launched");
	}
}
	public void screenshot(String path) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File srcfile=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile,new File(path));
		
	}
	public void quit()
	{
		driver.close();
	}
}
