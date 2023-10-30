package eveningbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
			
			
			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
       driver.manage().window().maximize();
       driver.get("file:///E:/SELENIUM-PRAJWAL/Linktext.html");
       Thread.sleep(3000);
       driver.findElement(By.linkText("google")).click();
       Thread.sleep(3000);
      driver.quit();
			
			
	}

}
