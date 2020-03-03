import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUpload {
	@Test
	public void testcase()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1222\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://filebin.net/ ");
	    driver.manage().window().maximize();
	    driver.findElement(By.className("upload")).sendKeys("C:\\Users\\BLTuser.BLT1222\\Desktop\\FL 2018 Sample Questions Exam A v1.3 Answers.pdf");
	    
	    

}
}
