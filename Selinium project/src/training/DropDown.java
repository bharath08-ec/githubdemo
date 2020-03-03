package training;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1222\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com");
	    
	    //wait for loading webpage
	    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	    
	    
	   //select drop down box 
	    Select day = new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
	    day.selectByIndex(29);
	    
	    Select month = new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
//	    month.selectByIndex(8);
	    month.selectByVisibleText("Aug");
	    
	    Select year = new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
	    year.selectByValue("1997"); 
	    
	    //click radio button
//	    driver.findElement(By.id("u_0_6")).click();
	    
	    driver.findElement(By.id("u_0_7")).click();
	}

}
