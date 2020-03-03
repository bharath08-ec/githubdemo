package main;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class signin {
	WebDriver driver;
	WebElement textbox;

	public void url() {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\BLTuser.BLT1222\\\\Desktop\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		

	}
	public void google_homepage()
	{
		driver.get("https://www.linkedin.com/");
		System.out.println(driver.getTitle());
	}

	public void verify() {
		driver.findElement(By.xpath("/html/body/nav/a[3]")).click();
		driver.findElement(By.id("username")).sendKeys("bharath12@gmail.com");
		driver.findElement(By.id("password")).sendKeys("531263ghsf");
		driver.findElement(By.xpath("//*[@id=\"app__container\"]/main/div/form/div[3]/button")).click();

		}


	}

