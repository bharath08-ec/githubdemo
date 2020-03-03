import java.awt.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TotalNoOfLinks {
@Test
public void testcase()
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1222\\Desktop\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
    driver.get("http://www.busindia.com/PRTC-Pondicherry-Online-Booking.jsp ");
    driver.manage().window().maximize();
    List<WebElement> e=driver.findElement(By.xpath(""));
    int count = e.size();
    System.out.println("total no of links " +count);
}
}
