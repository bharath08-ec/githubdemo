package Com.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Bmw_page {
	WebDriver driver;
	public Bmw_page(WebDriver driver) {
		
		this.driver = driver;
	}
	public void clcikbmw() throws InterruptedException
	{
		//click on models menu
		driver.findElement(By.linkText("Models")).click();
		
		//click on 7 in model menu
		driver.findElement(By.linkText("7")).click();
		Thread.sleep(5000);	
		
		//click on the image of bmw 7
		Actions action=new Actions(driver);
		WebElement a =driver.findElement(By.xpath("//img[@alt='Not found']"));
		action.moveToElement(a);
		action.click(a).build().perform();
		Thread.sleep(5000);
		
		//click technical data to find top speed 
		driver.findElement(By.linkText("Technical Data")).click();

		String b =driver.findElement(By.xpath("//*[@id=\"top-of-content\"]/div/div[3]/div/div/div[2]/section[1]/div[3]/div/div[1]/div/table/tbody/tr[4]/td[2]")).getText();
		System.out.println(b);
		String bb=b.substring(5,8);
		
		// If Top speed in km/h less than 500. Enter the message "Does not meet my requirements“
		int n = Integer.parseInt(bb);
		if(n < 500)
		{
			System.out.println("Does not meet my Reqiremnt");
		}
		else
		{
			System.out.println("meeting my Reqiremnt");
		}
	
		
	

     
	}
	

}

	
