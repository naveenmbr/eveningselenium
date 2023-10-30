package eveningbatch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		               WebDriver driver = new ChromeDriver();
		               
		              driver.manage().window().maximize();
		              driver.get("file:///E:/SELENIUM-PRAJWAL/indexcheckbox.html");
		              Thread.sleep(3000);
		             List<WebElement> boxes = driver.findElements(By.xpath("//input"));
		             int count = boxes.size();
		             
		             for (int i=0;i<count;i++)
		             {
		            	 WebElement box = boxes.get(i);
		            	 Thread.sleep(1000);
		            	 box.click();
		            	 
		             }
		             
		             
		             for (int i=count-1;i>=0;i--)
		             {
		            	
		            	 WebElement unbox = boxes.get(i);
		            	 unbox.click();
		            	 Thread.sleep(1000);
		             }
		             
		             
		            	 
		          //------------------------------
		              Thread.sleep(8000);
		             driver.quit();
		             
	}

}
