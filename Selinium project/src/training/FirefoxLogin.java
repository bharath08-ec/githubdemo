package training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLogin {

	public static void main(String[] args) {
		
		
	    System.setProperty("webdriver.gecko.driver","C:\\Users\\BLTuser.BLT1222\\Desktop\\Selinium extract\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
	    driver.get("https://www.gmail.com");
	}

}
