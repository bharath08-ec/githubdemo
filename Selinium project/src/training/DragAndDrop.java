package training;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1222\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://jqueryui.com/droppable/");
	    driver.manage().window().maximize();
	    
	    //iframe
	    driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	    
	    //draggable
//	    System.out.println(driver.findElement(By.xpath("//*[@id=\"draggable\"]/p")).isDisplayed());
//	    //switch to default content
//	    driver.switchTo().defaultContent();
//	    //click droppable
//	    driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[2]/a")).click();
	    
	    //Drag and drop
	    WebElement a = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
	    WebElement b = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
	    
	    Actions c=new Actions(driver);
	    c.dragAndDrop(a, b).build().perform();
	}

}
