package com.Pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Printprice_pages {
	WebDriver driver;
	By Monitors=By.xpath("//*[@id=\"itemc\"]");
	By Applemonitors=By.linkText("Apple monitor 24");

public void launching_chrome() { 
	System.setProperty("webdriver.chrome.driver","Driver//chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
}
public void product_store() 
{
	driver.get("https://www.demoblaze.com/");
	System.out.println(driver.getTitle());
	
}
public void Click_monitor() throws InterruptedException
{
	Thread.sleep(3000);
	driver.findElement(Monitors).click();
}
public void printprice() throws InterruptedException
{
	
	Thread.sleep(3000);
	driver.findElement(Applemonitors).click();
	Thread.sleep(3000);
	String s1=driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/h3")).getText();
	System.out.println(s1);
	
}
public void close()
{
	driver.close();
}
}
