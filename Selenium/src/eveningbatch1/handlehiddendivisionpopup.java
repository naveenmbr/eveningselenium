package eveningbatch1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlehiddendivisionpopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
			
			
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
    driver.manage().window().maximize();
       driver.get("https://demoqa.com/automation-practice-form");
       Thread.sleep(3000);
       driver.findElement(By.id("dateOfBirthInput")).click();
       Thread.sleep(1000);
       driver.findElement(By.xpath("//div[text()='18']")).click();
       Thread.sleep(1000);
    
     
       Thread.sleep(8000);
      driver.quit();
			 
			
	}

}
