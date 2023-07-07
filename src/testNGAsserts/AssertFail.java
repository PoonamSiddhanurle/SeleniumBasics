package testNGAsserts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertFail {
  @Test
  public void f() 
  {
	  Assert.fail();
	  Reporter.log("Hi");
  }
  @Test
  public void f1() 
  {
	  Reporter.log("Good Morning");
  }
}
