package eveningbatch;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robotaltfnf4closebrowser {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		Robot r = new Robot();
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ALT);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_F4);
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_F4);
		
		//Thread.sleep(1000);
	//	r.keyPress(KeyEvent.VK_N);
	//	r.keyRelease(KeyEvent.VK_N);
		
	
		
		//Thread.sleep(5000);
		//driver.quit();

	}

}
