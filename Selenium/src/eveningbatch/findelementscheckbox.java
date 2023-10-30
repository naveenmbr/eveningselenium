package eveningbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelementscheckbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		               WebDriver driver = new ChromeDriver();
		               
		              driver.manage().window().maximize();
		              driver.get("file:///E:/SELENIUM-PRAJWAL/tagname.html");
		              Thread.sleep(3000);
		              driver.findElement(By.tagName("a")).click();
		              Thread.sleep(3000);
		             driver.quit();
		             
	}

}
