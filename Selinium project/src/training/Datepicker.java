package training;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Datepicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1222\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com");
		
//	    driver.get("https://www.redbus.in");
//	    
//	    //maximize web page to window size
//	    driver.manage().window().maximize();
//	    
//	    driver.findElement(By.xpath("//*[@id=\"search\"]//div//div[3]//div//label")).click();
//	    driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]//table//tbody//tr[7]//td[4]")).click();
//	    driver.findElement(By.xpath("//*[@id=\"search\"]//div//div[4]//div//label")).click();
//	    driver.findElement(By.xpath("//*[@id=\"rb-calendar_return_cal\"]//table//tbody//tr[7]//td[6]")).click();
	}

}
