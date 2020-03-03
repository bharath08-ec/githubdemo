import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class WindowHandling {

	@Test
	public void irctc() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1222\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.irctc.co.in/nget/train-search ");
	    driver.manage().window().maximize();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[1]/a[5]")).click();
	    Thread.sleep(3000);
	    Set<String>WinHandles=driver.getWindowHandles();
	    System.out.println("The number of window handles are"+WinHandles.size());
	    for (String WinHandle:WinHandles) 
	    {
	    	driver.switchTo().window(WinHandle);	
		}
	    String title=driver.getTitle();
	    System.out.println("The page title is"+title);
	    driver.quit();
	    
	}
}
