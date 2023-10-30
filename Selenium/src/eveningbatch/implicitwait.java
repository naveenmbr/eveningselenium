package eveningbatch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitwait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
			
			
			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
       driver.manage().window().maximize();
    //----implicit wait
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.get("https://www.facebook.com");
       
        driver.findElement(By.id("email")).sendKeys("hii");
      
       
       driver.findElement(By.id("ps")).sendKeys("hello");
       
      // Thread.sleep(8000);
      driver.quit();
			
			
	}

}
