package eveningbatch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelementsmultitext {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		               WebDriver driver = new ChromeDriver();
		               
		              driver.manage().window().maximize();
		              driver.get("file:///E:/SELENIUM-PRAJWAL/multitextadd.html");
		              Thread.sleep(3000);
		             List<WebElement> text = driver.findElements(By.xpath("//input"));
		              Thread.sleep(3000);
		              for (WebElement text1 : text) {
		            	  text1.sendKeys("hi");
						
					}
		              
		              Thread.sleep(5000);
		              
		              
		             driver.quit();
		             
	}

}
