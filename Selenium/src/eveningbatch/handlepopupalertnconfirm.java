package eveningbatch;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlepopupalertnconfirm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
			
			
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
       driver.manage().window().maximize();
       driver.get("https://demo.guru99.com/test/delete_customer.php");
       Thread.sleep(1000);
       driver.findElement(By.name("cusid")).sendKeys("12345");
       Thread.sleep(1000);
       driver.findElement(By.name("submit")).click();
       Thread.sleep(1000);
      Alert alt = driver.switchTo().alert();
     String txt = alt.getText();
     System.out.println(txt);
     alt.accept();  //to accept and confirm
    //--to dismiss or cancel or close the pop-up 
    // alt.dismiss();
     
       Thread.sleep(8000);
      driver.quit();
			 
			
	}

}
