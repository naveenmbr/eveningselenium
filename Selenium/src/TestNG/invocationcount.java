package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class invocationcount {
  @Test(invocationCount = 4)
  public void tiger() {
	  Reporter.log("hi", true);
  }
  
  @Test()
  public void lion() {
	  Reporter.log("hello", true);
  }
}
