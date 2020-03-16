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


public class Base {
	protected WebDriver driver;
	public void LaunchApplication(String browser,String url)
	{
		try
		{
			if(browser.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver","Driver//geckodriver.exe");
				driver=new FirefoxDriver();
			}
			else if (browser.equalsIgnoreCase("chrome")) 
			{
				System.setProperty("webdriver.chrome.driver", "Driver//chromedriver.exe");
				driver=new ChromeDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get(url);
		}
		catch (Exception e) {
		System.out.println("Browser cant be reached");
		}
	}
	public void screenshot(String path) throws IOException {
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File Srcfile=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Srcfile,new File(path));
		
		
	}
	public void close() {
		
		driver.close();
	}
	}


