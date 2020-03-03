package TestCase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Library.WrapperEx;
import Pages.LinkedinLogin;

public class LoginpgTestcase extends WrapperEx {
	@BeforeClass
	public void startUp() 
	{
		launchApplication("chrome","https://www.linkedin.com/login?fromSignIn=true&session_redirect=https%3A%2F%2Fwww.linkedin.com%2Fjobs&trk=guest_homepage-jobseeker_nav-header-signin");
	}
	@Test
	public void login()
	{
		LinkedinLogin lpage=new LinkedinLogin(driver);
		lpage.loginToApp_username("Welcome");
		lpage.loginToApp_password("welcome123");
		lpage.loginToApp_Loginbutton();
		
	}
	
}
