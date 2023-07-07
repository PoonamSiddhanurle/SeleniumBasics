package dataProvider;

import org.testng.annotations.DataProvider;


public class DataProviderTest {
  @DataProvider(name="FBData")
  public static String[][] testData() 
  {
	  String data[][]= {{"Poonam","Siddhanurle","8575456525"},{"Mahesh","Siddhanurle","7852623515"}};
	return data;
  }
  @DataProvider(name="rediff")
  public static String[][] testData1()
  {
	  String data[][]= {{"Ira","Siddhanurle","8254789586"},{"Shoyrya","Patil","7852623541"}};
	  return data;
  }
  
}
