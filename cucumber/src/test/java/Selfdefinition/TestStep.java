package Selfdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestStep {
	WebDriver driver;
	@Given("I launch Chrome browser")
	public void launch_browser() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1222\\Desktop\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(1000);
	}
	@When("I open Google Homepage")
	public void open_homepage() throws InterruptedException
	{
	Thread.sleep(5000);
	driver.get("https://www.google.co.in");
	}
	@Then("I verify that the page displays search text box")
	public void verify_textbox()           
	{
	WebElement txtbox=driver.findElement(By.name("q"));
	if(txtbox.isEnabled())
	{
	txtbox.sendKeys("mail.cognizant");
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	driver.findElement(By.xpath("//*[@id=\"rso\"]/div/div/div[1]/div/div/div[1]/a/h3")).click();	
	driver.findElement(By.xpath("//*[@id=\"userNameInput\"]")).sendKeys("844891");
	

	}
	}
	@And("clicks the submit button")
	public void display_searchbutton()
	{

	System.out.println("The page displays Google Search Button");

	}


}
