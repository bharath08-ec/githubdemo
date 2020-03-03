package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LinkedinLogin {

	WebDriver driver;
	By username=By.name("session_key");
	By password=By.id("password");
	By loginbutton=By.xpath("//*[@id=\"app__container\"]/main/div/form/div[3]/button");
	
	public LinkedinLogin(WebDriver driver) {
		
		this.driver = driver;
	}
	public void loginToApp_username(String userid)
	{
		driver.findElement(username).sendKeys(userid);
	}
	public void loginToApp_password(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	public void loginToApp_Loginbutton()
	{
		driver.findElement(loginbutton).click();
	}

	
}
