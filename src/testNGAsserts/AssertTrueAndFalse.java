package testNGAsserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueAndFalse {
  @Test
  public void b() 
  {
	  boolean a=true;
	  boolean b=false;
	  //Assert.assertTrue(a);
	  Assert.assertTrue(b, "value is false TC is failed");
	  //Assert.assertFalse(a);
	  Assert.assertFalse(a, "value is true TC is failed");
  }
}
