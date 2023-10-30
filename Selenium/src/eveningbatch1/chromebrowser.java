package eveningbatch1;

import org.openqa.selenium.chrome.ChromeDriver;

public class chromebrowser {

	public static void main(String[] args) {
		String key ="webdriver.chrome.driver";
		String value = "./software/chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
	}
}
