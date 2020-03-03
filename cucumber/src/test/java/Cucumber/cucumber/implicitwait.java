package Cucumber.cucumber;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class implicitwait {
	@Test
	public void testcase() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1222\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.get("http://www.busindia.com/PRTC-Pondicherry-Online-Booking.jsp ");
	    driver.findElement(By.id("matchFromPlace")).sendKeys("puducherry");
	    driver.findElement(By.id("matchToPlace")).sendKeys("chennai");
	    WebDriverWait wait= new WebDriverWait(driver, 10);
	    WebElement element =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"searchForm\"]/div[3]/div[1]/div/div/div/div[1]/div[8]/button")));
		driver.findElement(By.xpath("//*[@id=\"app__container\"]/main/div/form/div[3]/button")).click();
		Thread.sleep(3000);
	}

}
