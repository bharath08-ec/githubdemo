package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeLogin {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1222\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.linkedin.com");
	    
	    //Click any button
//	    driver.findElement(By.className("nav__button-secondary")).click();
	    
	    //Enter username
	    driver.findElement(By.id("username")).sendKeys("bharath@gmail.com");
	    
	    //Enter password 
//	    driver.findElement(By.name("session_password")).sendKeys("bharhone1997");
	    
	    //Relative xpath : starts with //
//	    driver.findElement(By.xpath("//*[@id=\"app__container\"]/main/div/form/div[3]/button")).click();
	    
	    //Absolute xpath : starts with /
//	   driver.findElement(By.xpath("/html/body/div/main/div/form/div[3]/button")).click();
	    
	    //To click any link
//	    driver.findElement(By.linkText("Join now")).click();
//	    driver.findElement(By.partialLinkText("Join")).click();
	    
	   //relative xpath
	    driver.findElement(By.xpath("//*[@class ='pill pill--talent-finder-cta']")).click();
	    
	  //relative xpath using and condition
	    driver.findElement(By.xpath("//*[@type='text' and @id='first-name-ember18']")).sendKeys("Bharath");
	   
	    
	   //relative xpath using or condition
	    driver.findElement(By.xpath("//*[@type='text' and @id='last-name-ember18']")).sendKeys("Munian");
	    
	    //relative xpath using contains
	    driver.findElement(By.xpath("//*[contains(@id,'email')]")).sendKeys("bharath@gmail.com");
	    
	    //relative xpath using starts-with 
	    driver.findElement(By.xpath("//*[starts-with(@id,'pas')]")).sendKeys("bnnsdvjgs");
	   
	   }

}
