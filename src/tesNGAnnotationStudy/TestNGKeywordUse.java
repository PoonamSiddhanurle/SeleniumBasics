package tesNGAnnotationStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGKeywordUse {
  @Test(invocationCount = 4)
  public void myMethod1() 
  {
	  Reporter.log("Mymethod1 is running", false);
  }
  @Test (priority = -3)
  public void myMethod2() 
  {
	  Reporter.log("Mymethod2 is running", false);
  }
  @Test (priority = -1)
  public void myMethod3() 
  {
	  Reporter.log("Mymethod3 is running", false);
  }
  @Test (timeOut = 2000)
  public void myMethod4() throws InterruptedException 
  {
	  Thread.sleep(1000);
	  Reporter.log("Mymethod4 is running", false);
  }
  @Test (enabled = false)
  public void myMethod5()
  {
	  
	  Reporter.log("Mymethod4 is running", false);
  }
  
  
}
