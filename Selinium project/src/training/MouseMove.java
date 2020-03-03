package training;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMove {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1222\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.hdfcbank.com");
	    driver.manage().window().maximize();
//	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    //mouse move
	    WebElement a = driver.findElement(By.xpath("//*[@id=\"main\"]//div//div[13]//div[3]//div[3]//div//div//div//div//div//div//div//div[1]//div[2]//ul//li[2]//a"));
	    WebElement b = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[13]/div[3]/div[3]/div/div/div/div/div/div/div/div[1]/div[2]/ul/li[2]/ul/li[2]/ul/li[3]/a/span"));
	    
	   //"Actions" is a class used for mouse and keyboard moves
	    Actions c = new Actions(driver);
	    
	   c.moveToElement(a);
	   c.moveToElement(b).click().build().perform();
	    
	}

}
