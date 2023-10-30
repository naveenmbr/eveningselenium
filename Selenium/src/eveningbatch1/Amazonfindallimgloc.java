package eveningbatch1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonfindallimgloc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		List<WebElement> locations = driver.findElements(By.xpath("//img"));
		Thread.sleep(3000);
		
	for (WebElement location : locations) {
		
		String loc1 = location.getAttribute("src");
//	Point loc = location.getLocation();
	System.out.println(loc1);
		
	}
		
		Thread.sleep(5000);
		driver.quit();

	}

}
