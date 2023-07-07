package testNGAsserts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEualAndNotEqual {
  @Test
  public void a() 
  {   
	  String s1="Poonam";
	  String s2="Poonam";
	  String s3="Mahesh";
	  //Assert.assertEquals(s1, s2);
	  Assert.assertEquals(s1, s3, "value is not equal TC is failed");
	  Assert.assertNotEquals(s1, s2, "value is equal TC is failed");
	  //Assert.assertNotEquals(s1, s3);
	  
  }
}
 