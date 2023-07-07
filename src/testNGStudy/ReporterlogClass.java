package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReporterlogClass {
  @Test
  public void f() {
	  System.out.println("Hi Good Morning");
	  Reporter.log("Good");
	  Reporter.log("Best", true);
  }
 // @Test
  public void myMethod()
  {
	  Reporter.log("myMethod is running", true);
  }
}
