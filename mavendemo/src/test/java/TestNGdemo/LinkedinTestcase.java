package TestNGdemo;

import org.testng.annotations.Test;
import org.testng.internal.WrappedTestNGMethod;



import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LinkedinTestcase {
  @Test
  public void testcase1() {
	  WebDriver driver=new ChromeDriver();
	  driver.findElement(By.xpath("/html/body/nav/a[3]")).click();
	  driver.findElement(By.xpath("/html/body/nav/section[2]/form/div[1]/div[1]/input")).sendKeys("bharath@gmail.com");
	  driver.findElement(By.xpath("/html/body/nav/section[2]/form/div[1]/div[2]/input")).sendKeys("bharhone1997");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1222\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.linkedin.com/");
	    driver.manage().window().maximize();
  }

  @AfterMethod
  public void afterMethod() {
	  WebDriver driver=new ChromeDriver();
	  driver.close();

	  
	  
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
