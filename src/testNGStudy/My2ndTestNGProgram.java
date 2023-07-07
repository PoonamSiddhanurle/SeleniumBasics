package testNGStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class My2ndTestNGProgram {
  @Test(invocationCount = 4)
  public void validateUserName() {
	  Reporter.log("Poonam");
	  
  }
  @Test
  public void validateGender() {
	  Reporter.log("Female");
	  
  }
  @Test
  public void validateMobNo() {
	  Reporter.log("90679111404");
	  
  }
}
