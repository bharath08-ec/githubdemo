package training;

import java.io.File;
import java.io.IOException;

import javax.swing.plaf.FileChooserUI;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeSnapShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1222\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.linkedin.com");
	    
	    //take screen shot
	    TakesScreenshot ts=((TakesScreenshot)driver);
	    File srFile=ts.getScreenshotAs(OutputType.FILE);
	   
		FileUtils.copyFile(srFile,new File("C:\\Users\\BLTuser.BLT1222\\Desktop\\scr\\bharatss.jpg"));
	
		
		
	    
	}

}
