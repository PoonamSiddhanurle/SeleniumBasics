package testNGxml;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupStudy2 {
	@Test(groups = "sanity")
	  public void myMethod7() 
	  {
		 Reporter.log("Method7 is running", true); 
	  }
	  @Test(groups = "Regression")
	  public void myMethod8() 
	  {
		 Reporter.log("Method8 is running", true); 
	  }
	  @Test(groups = "sanity")
	  public void myMethod9() 
	  {
		 Reporter.log("Method9 is running", true); 
	  }
	  @Test(groups = "Regression")
	  public void myMethod10() 
	  {
		 Reporter.log("Method10 is running", true); 
	  }
	  @Test
	  public void myMethod11() 
	  {
		 Reporter.log("Method11 is running", true); 
	  }
	  @Test
	  public void myMethod12() 
	  {
		 Reporter.log("Method12 is running", true); 
	  }
	}
