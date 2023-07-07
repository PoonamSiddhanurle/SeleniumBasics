package dataProvider;

import org.testng.annotations.DataProvider;


public class PolicyDataProvider {
  @DataProvider(name="PolicyBazaarData")
  public static String[][]data1() 
  {
	  String data[][]= {{"8261072161","poonam@1234","Poonam Siddhanurle"}};
	return data;
  }
}
