package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestAnnotationUse {
  @Test
  public void myMethod1()
  {
	  Reporter.log("myMethod1 is running", true);
  }
  @Test
  public void myMethod2()
  {
	  Reporter.log("myMethod2 is running", true);
  }
  @Test
  public void myMethod3()
  {
	  Reporter.log("myMethod3 is running", true);
  }
  @Test
  public void myMethod4()
  {
	  Reporter.log("myMethod4 is running", true);
  }
}
