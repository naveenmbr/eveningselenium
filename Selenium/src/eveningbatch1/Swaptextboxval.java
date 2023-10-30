package eveningbatch1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swaptextboxval {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("E:\\SELENIUM-PRAJWAL\\swaptextboxval.html");
		//driver.navigate().to("https://www.amazon.com/");
	//---cut-automation 2 and paste in 3 text box
		WebElement ele2 = driver.findElement(By.xpath("//input[@id='a2']"));
		ele2.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		ele2.sendKeys(Keys.CONTROL+"x");
		Thread.sleep(3000);
	WebElement ele3 = driver.findElement(By.xpath("//input[@id='a3']"));
	ele3.sendKeys(Keys.CONTROL+"v");
	//----cut Manual 1 and paste in 2 text box
	Thread.sleep(2000);
	WebElement ele1 = driver.findElement(By.xpath("//input[@id='a1']"));
	ele1.sendKeys(Keys.CONTROL+"a");
	Thread.sleep(2000);
	ele1.sendKeys(Keys.CONTROL+"x");
	Thread.sleep(3000);
	ele2.sendKeys(Keys.CONTROL+"v");
	//---cut from 3 text box to 1 text box
	
	
	ele3.sendKeys(Keys.CONTROL+"a");
	
	Thread.sleep(2000);
	ele3.sendKeys(Keys.CONTROL+"x");
	Thread.sleep(3000);
	ele1.sendKeys(Keys.CONTROL+"v");
	
	//=--
	Thread.sleep(4000);
	ele3.sendKeys("1000");
	Thread.sleep(2000);
	ele3.clear();
	
		
		Thread.sleep(5000);
		driver.quit();

	}

}
