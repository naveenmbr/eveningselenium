package eveningbatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtubesrch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		String s1 = "sapta sagaradaache yello";
		driver.findElement(By.cssSelector("input[id='search']")).sendKeys("sapta sagaradaache yello");
		
		driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[title='Sapta Sagaradaache Ello (Side A) - Official Trailer | Rakshit Shetty | Rukmini | Hemanth M Rao']")).click();
		Thread.sleep(2000);
		
		//use  aria-label  --attribute in button link
		driver.findElement(By.cssSelector("div[class='yt-spec-touch-feedback-shape__fill']")).click();
		Thread.sleep(14000);
		driver.quit();
	}

}
