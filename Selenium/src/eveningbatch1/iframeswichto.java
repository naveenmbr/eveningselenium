package eveningbatch1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframeswichto {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
			
			
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
       driver.manage().window().maximize();
       driver.get("file:///E:/SELENIUM-PRAJWAL/main.html");
       Thread.sleep(3000);
       driver.findElement(By.id("a1")).sendKeys("Hii");
       Thread.sleep(1000);
       driver.findElement(By.id("e1")).sendKeys("Hello");
       Thread.sleep(1000);
      WebElement frame = driver.findElement(By.tagName("iframe"));
      Thread.sleep(1000);
      driver.switchTo().frame(frame);
      Thread.sleep(1000);
      driver.findElement(By.id("p1")).sendKeys("Hi Naveen");
       Thread.sleep(8000);
      driver.quit();
			 
			
	}

}
