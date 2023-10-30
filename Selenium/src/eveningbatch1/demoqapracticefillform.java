package eveningbatch1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class demoqapracticefillform {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//--
		/*
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		co.addArguments("disable-notifications");
		co.addArguments("--enable-javascript");
		*/
		//--
		
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/automation-practice-form");
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Testfirst");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Testlast");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("test@email.com");
		Thread.sleep(1000);
		
	WebElement ele = driver.findElement(By.xpath("//input[@id='gender-radio-1']"));
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click()", ele);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("9845098450");
		Thread.sleep(1000);
		WebElement ele1 = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("arguments[0].click()", ele1);
		WebElement sel = driver.findElement(By.className("react-datepicker__year-select"));
		Select selopt = new Select(sel);
		selopt.selectByValue("1990");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='15']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='subjectsInput']")).sendKeys("a");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(1000);
		
		
		 WebElement ele3 = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']"));
		 JavascriptExecutor jse2 = (JavascriptExecutor)driver;
			jse2.executeScript("arguments[0].click()", ele3);
		
		driver.findElement(By.xpath("//input[@id='uploadPicture']")).sendKeys("E:\\SELENIUM-PRAJWAL\\emp.xlsx");
		
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("#12,50th main.bangalore");
		
		
		//jse.executeScript("window.ScrollBy(0, 1500)");
		
		//driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
		
		
		Thread.sleep(12000);
		driver.quit();
	}

}
