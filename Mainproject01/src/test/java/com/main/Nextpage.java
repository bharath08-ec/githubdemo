package com.main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nextpage {
	WebDriver driver;
	
	public void Launchchrome3()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1222\\Desktop\\chromedriver.exe");
		driver=new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	public void Url3()
	{
		driver.get("https://demoblaze.com/");
		driver.findElement(By.xpath("//*[@id=\"signin2\"]")).click();
	}
	public void Next() throws InterruptedException
	{
		driver.findElement(By.id("next2")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("hrefch")).click();
	}

}
