package Library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WrapperApple {
	 protected WebDriver driver;
		
		public void launchApplication(String browser, String url) {
			
			try {
				if (browser.equalsIgnoreCase("firefox")) {
					driver = new FirefoxDriver();
				} else if (browser.equalsIgnoreCase("chrome")) {
					System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1222\\Desktop\\chromedriver.exe");
					driver=new ChromeDriver();

				}

				driver.manage().window().maximize();
			
				driver.get(url);
			
			} catch (WebDriverException e) {
				System.out.println(" browser could not be launched");
			}
		
		}
}
