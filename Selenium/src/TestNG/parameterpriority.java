package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class parameterpriority {
  @Test(priority = 1)
  public void tiger() {
	  Reporter.log("Hi", true);
  }
  //--
  @Test(priority = 0)
  public void lion() {
	  Reporter.log("hello", true);
  }
  //--
  @Test(priority = 3)
  public void dog() {
	  Reporter.log("bye", true);
  }
  
  //--
  @Test(priority = 4)
  public void cat() {
	  Reporter.log("tata", true);
  }
  
  //--
}
