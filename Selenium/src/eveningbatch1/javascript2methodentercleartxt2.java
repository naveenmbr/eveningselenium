package eveningbatch1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript2methodentercleartxt2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
			
			
			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
       driver.manage().window().maximize();
       driver.get("file:///E:/SELENIUM-PRAJWAL/jsetxt.html");
       Thread.sleep(1000);
       WebElement ele = driver.findElement(By.xpath("//input[@name='n1']"));
       JavascriptExecutor jse = (JavascriptExecutor)driver;
       Thread.sleep(1000);
       jse.executeScript("arguments[0].value='abcd'",ele);
       
  //     driver.findElement(By.linkText("google")).click();
       Thread.sleep(4000);
      driver.quit();
			
			
	}

}
