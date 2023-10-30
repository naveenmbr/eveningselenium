package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class enabled {
  @Test(enabled = false)
  public void f() {
	  Reporter.log("hello", true);
  }
}
