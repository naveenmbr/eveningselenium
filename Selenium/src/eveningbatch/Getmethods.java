package eveningbatch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getmethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		//WebDriver driver=new ChromeDriver();
	WebDriver driver=new ChromeDriver();
	Thread.sleep(2000);
	          String title = driver.getTitle();
	       System.out.println(title);
     Thread.sleep(3000);
                String p_code = driver.getPageSource();
                System.out.println(p_code);
      Thread.sleep(2000);
                      String c_url = driver.getCurrentUrl();
	}

}
