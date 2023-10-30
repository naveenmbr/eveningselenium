package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample {

	@Test
	public void run() {
		Reporter.log("Hii", true);
				
		//System.out.println("TestNG");
	}
	@Test
	public void ru()
	{
		Reporter.log("hello", true);
	}
}
