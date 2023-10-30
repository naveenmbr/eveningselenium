package eveningbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwaitsync {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
      ChromeDriver driver = new ChromeDriver();
      driver.get("https://www.facebook.com");
      
      WebDriverWait w=new WebDriverWait(driver, 10);
      w.until(ExpectedConditions.titleContains("Facebook"));
      driver.findElement(By.id("email")).sendKeys("hii");
      driver.findElement(By.id("pass")).sendKeys("hello");
      
      Thread.sleep(5000);
      driver.quit();
	}

}
