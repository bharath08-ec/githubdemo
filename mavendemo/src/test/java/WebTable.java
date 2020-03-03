import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTable {
	@Test
	public void testcase()
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1222\\Desktop\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
   
    driver.manage().window().maximize();
    driver.get("http://demo.guru99.com/test/web-table-element.php");
    List  col = driver.findElements(By.xpath(".//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
    System.out.println("No of cols are : " +col.size()); 
    //No.of rows 
    List  rows = driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr/td[1]")); 
    System.out.println("No of rows are : " + rows.size());

}
}
