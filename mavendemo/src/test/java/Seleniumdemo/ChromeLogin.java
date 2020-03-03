package Seleniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1222\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://en.wikipedia.org/wiki/Puducherry");
	    driver.manage().window().maximize();
	}

}
