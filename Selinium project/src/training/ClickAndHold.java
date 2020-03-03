package training;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1222\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://jqueryui.com/selectable/");
	    driver.manage().window().maximize();
	    driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	    WebElement a = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]"));
	    WebElement b = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[2]"));
	    WebElement c = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[3]"));
	    WebElement d = driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[4]"));
	    
	    Actions ca=new Actions(driver);
	    ca.clickAndHold(a).clickAndHold(d).release().build().perform();
	}

}
