package eveningbatch1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathtraverse {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.bollymoviereviewz.com/2013/04/bollywood-box-office-collection-2013.html");

WebElement ele = driver.findElement(By.xpath("//a[text()='Jawaan(Hindi) ']/../../../td[2]"));

String collection = ele.getText();
System.out.println(collection);
Thread.sleep(5000);

//---locate budget and click on jawan
driver.findElement(By.xpath("//td[text()='80 Crore']/..//a")).click();
System.out.println("jawan link");
Thread.sleep(15000);
driver.quit();

	}
	

}
