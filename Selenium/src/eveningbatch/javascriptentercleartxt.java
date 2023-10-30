package eveningbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptentercleartxt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
			
			
			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
       driver.manage().window().maximize();
       driver.get("file:///E:/SELENIUM-PRAJWAL/jsetxt.html");
       Thread.sleep(1000);
       JavascriptExecutor jse = (JavascriptExecutor)driver;
       Thread.sleep(1000);
  //   jse.executeScript("document.getElementById('a1').value=''");
       
       jse.executeScript("document.getElementById('a1').value=''");
       
       
       
       
       //---
        JavascriptExecutor jse5 = (JavascriptExecutor)driver;
        jse5.executeScript("arguments[0].value='a1'", ele)
       //--
       
  //     driver.findElement(By.linkText("google")).click();
       Thread.sleep(3000);
      driver.quit();
			
			
	}

}
