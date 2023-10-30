package eveningbatch;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class shifttoeverynewtab {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		
		//--shifting of tab not working properly in Chrome browser	
			
//		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
//		 WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
       
		 WebDriver driver = new FirefoxDriver();
    driver.manage().window().maximize();
       driver.get("https://www.selenium.dev/");
       Thread.sleep(1000);
       
       
      WebElement ele1 = driver.findElement(By.xpath("//span[text()='Downloads']"));
      WebElement ele2 = driver.findElement(By.xpath("//span[text()='Documentation']"));
      WebElement ele3 = driver.findElement(By.xpath("//span[text()='Projects']"));
      WebElement ele4 = driver.findElement(By.xpath("//span[text()='Support']"));
      WebElement ele5 = driver.findElement(By.xpath("//span[text()='Blog']"));
       Thread.sleep(1000);
       Actions act = new Actions(driver);
       Robot r = new Robot();
       
       act.contextClick(ele1).perform();
       r.keyPress(KeyEvent.VK_T);
       r.keyRelease(KeyEvent.VK_T);
       Thread.sleep(1000);
       
       act.contextClick(ele2).perform();
       r.keyPress(KeyEvent.VK_T);
       r.keyRelease(KeyEvent.VK_T);
       Thread.sleep(1000);
       
       act.contextClick(ele3).perform();
       r.keyPress(KeyEvent.VK_T);
       r.keyRelease(KeyEvent.VK_T);
       Thread.sleep(1000);
       
       act.contextClick(ele4).perform();
       r.keyPress(KeyEvent.VK_T);
       r.keyRelease(KeyEvent.VK_T);
       Thread.sleep(1000);
       
       act.contextClick(ele5).perform();
       r.keyPress(KeyEvent.VK_T);
       r.keyRelease(KeyEvent.VK_T);
       Thread.sleep(1000);
       
       Set<String> allid = driver.getWindowHandles();
        ArrayList<String> arrid = new ArrayList<String>(allid);
       
       for(String eachid : arrid)
       {
    	   driver.switchTo().window(eachid);
    	   Thread.sleep(2000);
       }
       
       
      // driver.findElement(By.xpath("//div[text()='18']")).click();
       Thread.sleep(1000);
    
     
       Thread.sleep(8000);
      driver.quit();
			 
			
	}

}
