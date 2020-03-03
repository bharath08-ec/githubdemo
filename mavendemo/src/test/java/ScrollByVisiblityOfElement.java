import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollByVisiblityOfElement {
	WebDriver driver;
    @Test
    public void ByVisibleElement() {
        System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\BLTuser.BLT1222\\\\Desktop\\\\chromedriver.exe");
      
        driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //Launch the application		
        driver.get("https://www.linkedin.com/");
        driver.manage().window().maximize();

        //Find element by link text and store in variable "Element"        		
        WebElement Element = driver.findElement(By.xpath("/html/body/main/section[3]/div/a"));

        //This will scroll the page till the element is found		
        js.executeScript("arguments[0].scrollIntoView();", Element);
    }
}
