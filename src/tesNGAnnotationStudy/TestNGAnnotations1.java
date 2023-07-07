package tesNGAnnotationStudy;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotations1 {
 /* @Test
  @BeforeMethod
  @AfterMethod
  @BeforeClass
  @Afterclass*/
  //Test case
  @BeforeClass
  public void myMethod5() 
  {
	  Reporter.log("Beforeclass annotation", true);
  }
  @BeforeMethod
  public void myMethod3() 
  {
	  Reporter.log("BeforeMethod annotation", true);
  }
  @Test (timeOut = 3000)
  public void myMethod1() 
  {
	  Reporter.log("test annotation", true);
  }
  @Test (priority = 0)
  public void myMethod6() 
  {
	  Reporter.log("test annotation", true);
  }
  @AfterMethod
  public void myMethod2() 
  {
	  Reporter.log("AfterMethod annotation", true);
  }
  @AfterClass
  public void myMethod4() 
  {
	  Reporter.log("AfterClass annotation", true);
  }
}
