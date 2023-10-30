package eveningbatch1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class compareflipkaramazonprice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
			
			
			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
       driver.manage().window().maximize();
    //----implicit wait
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.get("https://www.flipkart.com");
       
       driver.findElement(By.xpath("//span[text()='✕']")).click();
       Thread.sleep(1000);
       driver.findElement(By.name("q")).sendKeys("iphone 14 plus");
       Thread.sleep(1000);
       
       
       Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 Plus (Blue, 128 GB)']")).click();
        
       WebElement ele = driver.findElement(By.xpath("(//div[text()='₹65,999'])[1]"));
     String price = ele.getText();
     System.out.println(price);
     // replace the rupees 
     
     //----same repeat for iphone price in AMAZON and get the value
     //convert the price in string to int 
      
       
    //   driver.findElement(By.id("ps")).sendKeys("hello");
       
       Thread.sleep(5000);
      driver.quit();
			
			
	}

}
