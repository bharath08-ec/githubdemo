import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BasicDemo {
	
	@Test
	public void testcase()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1222\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("http://www.busindia.com/PRTC-Pondicherry-Online-Booking.jsp ");
	    driver.manage().window().maximize();
	}

}
 