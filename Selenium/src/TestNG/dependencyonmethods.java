package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependencyonmethods {
  @Test(priority = 0)                 //PASS
  public void tiger() {
	  System.out.println("account is created");
  }
  //--
  @Test(priority = 1,dependsOnMethods = "tiger")
  public void lion() {
	  Assert.fail();  // fail or skip the test case Intentionally  //FAIL
	  System.out.println("logged in succesfully");
  }
  //--
  @Test(priority = 2,dependsOnMethods = "lion")
  public void run() {
	  System.out.println("request sent");     //skip-----SKIP
  }
}
