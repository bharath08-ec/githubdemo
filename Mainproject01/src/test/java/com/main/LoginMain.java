package com.main;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginMain {
WebDriver driver;
//Excelutility eu = new Excelutility();
	public void launchchrome()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1222\\Desktop\\chromedriver.exe");
		driver=new ChromeDriver(); 
				driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	public void url()
	{
		driver.get("https://demoblaze.com/");
		driver.findElement(By.xpath("//*[@id=\"signin2\"]")).click();
	}
	public void login() throws IOException, InterruptedException
	{
		
				driver.findElement(By.id("sign-username")).sendKeys("bharath");
				driver.findElement(By.id("sign-password")).sendKeys("1234");
				driver.findElement(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]")).click();
				Thread.sleep(5000);
				Alert a=driver.switchTo().alert();
				a.accept();
			}	

	
	}

