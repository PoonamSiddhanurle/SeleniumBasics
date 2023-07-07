package tesNGAnnotationStudy;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsUse {
  @BeforeClass
  public void launchBrowser()
  {
	System.out.println("launch Browser and open URL");	//launch only one time
  }
  @BeforeMethod
  public void loginDetailse()
  {
	  System.out.println("login to the application");
  }
  @Test
  public void validateUserName() 
  {
	  System.out.println("Validate UserName");
  }
  @Test
  public void validateGender() 
  {
	System.out.println("Validate Gender");  
  }
  @AfterMethod
  public void logout()
  {
	  System.out.println("Logging out...");
  }
  @AfterClass
  public void closeBrowser()
  {
	  System.out.println("Close Browser");//close only one time
  }
 
}
