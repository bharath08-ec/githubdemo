package com.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Placeorder_Alerthandling_pages {
	WebDriver driver;
	By click_cart=By.xpath("//*[@id=\"navbarExample\"]/ul/li[4]/a");
	By placeorder=By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button");
	By purchase=By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]");

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
public void click_placeorder() throws InterruptedException
{
	Thread.sleep(3000);
	driver.findElement(click_cart).click();
	Thread.sleep(3000);
	driver.findElement(placeorder).click();
	
}
public void purchase() throws InterruptedException
{
	Thread.sleep(3000);
	driver.findElement(purchase).click();
	Thread.sleep(3000);
	String a= driver.switchTo().alert().getText();
	System.out.println(a);
	Thread.sleep(3000);
	Alert b=driver.switchTo().alert();
	b.accept();
	
	
	
}
public void close() throws InterruptedException
{
	Thread.sleep(3000);
	driver.close();
}
}
