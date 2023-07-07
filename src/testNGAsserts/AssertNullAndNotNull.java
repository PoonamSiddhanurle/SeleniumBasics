package testNGAsserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNullAndNotNull {
  @Test
  public void a() 
  {
	  String s1=null;
	  String s2="Ira";
	  Assert.assertNull(s1);
	  Assert.assertNull(s2, "Value is  not Null TC is failed");
	  //Assert.assertNotNull(s2);
	  //Assert.assertNotNull(s1, "Value is Null TC is failed");
  }
}
