package eveningbatch1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstwebpagelaunch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
      ChromeDriver driver = new ChromeDriver();
      driver.get("file:///E:/SELENIUM-PRAJWAL/firstwebpage.html");
      Thread.sleep(3000);
      driver.quit();
	}

}
