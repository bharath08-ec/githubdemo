package training;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1222\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("http://www.busindia.com/PRTC-Pondicherry-Online-Booking.jsp ");
	    driver.manage().window().maximize();
	    
	    //Alert cant be inspected
	   driver.findElement(By.xpath("//*[@id=\"searchForm\"]/div[3]/div[1]/div/div/div/div[1]/div[8]/button")).click();
	   Alert a=driver.switchTo().alert();
	   
	   System.out.println(a.getText());
	   //accept  for ok button
 a.accept();
//	   //dismiss for cancel button
//	   a.dismiss();
//	   //passing values
	   a.sendKeys("Bharath");
	   
	   //close tab
//	   driver.close();
//	   
	   //close browser
	   driver.quit();
	   
	   
	}

}
