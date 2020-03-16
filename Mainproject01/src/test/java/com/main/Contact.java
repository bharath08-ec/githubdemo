package com.main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contact {
WebDriver driver;

public void Launchchrome2()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1222\\Desktop\\chromedriver.exe");
	driver=new ChromeDriver(); 
			driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
}
public void Url2()
{
	driver.get("https://demoblaze.com/");
	driver.findElement(By.xpath("//*[@id=\"signin2\"]")).click();
}
public void contact() throws InterruptedException
{
	driver.findElement(By.className("nav-link")).click(); //click contact
	driver.findElement(By.id("recipient-email")).sendKeys("bharath@gmail.com");  //enter contact email
	driver.findElement(By.id("recipient-name")).sendKeys("bharath");  //enter contact name
	driver.findElement(By.id("message-text")).sendKeys("Hi this is bharath");  //enter message
	driver.findElement(By.xpath("//*[@id=\"exampleModal\"]/div/div/div[3]/button[2]")).click();  //click send message
	Thread.sleep(5000);
	Alert c=driver.switchTo().alert();
	c.accept();
}
}
