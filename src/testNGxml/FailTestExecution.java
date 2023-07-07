package testNGxml;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FailTestExecution {
	@Test
	  public void myMethod1() 
	  {
		 Reporter.log("Method1 is running", true); 
	  }
	  @Test
	  public void myMethod2() 
	  {
		 //Assert.fail();
		 Reporter.log("Method2 is running", true);  
	  }
	  @Test
	  public void myMethod3() 
	  {
		 Reporter.log("Method3 is running", true); 
	  }
	  @Test
	  public void myMethod4() 
	  {
		 Reporter.log("Method4 is running", true); 
	  }
	  @Test
	  public void myMethod5() 
	  {
		 Reporter.log("Method5 is running", true); 
	  }
	  @Test
	  public void myMethod6() 
	  {
		 Reporter.log("Method6 is running", true); 
	  }
	}
