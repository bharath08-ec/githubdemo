package com.main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Addtocart {
	WebDriver driver;

	public void launchchrome1()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1222\\Desktop\\chromedriver.exe");
		driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	public void url1()
	{
		driver.get("https://demoblaze.com/");
		
	}
	public void add() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[1]/div/div/h4/a")).click(); //click samsung mobile
		driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[2]/div/a")).click(); //click add to cart
		Thread.sleep(3000);
		Alert b=driver.switchTo().alert();
		b.accept();
		Thread.sleep(3000);
		driver.findElement(By.id("cartur")).click();  // click cart menu
	}

}
