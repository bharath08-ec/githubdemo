package Com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class currency {
WebDriver driver;
public currency(WebDriver driver) {
	
	this.driver = driver;
}
public void changecurrency()
{
	driver.findElement(By.xpath("/html/body/div[2]/div[1]/section/div/form/button")).click();
	driver.findElement(By.id("dropdownCurrency")).click();
	driver.findElement(By.xpath("//*[@id=\"header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[1]/div/div/div/a[1]")).click();
}
}
