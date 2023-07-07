package testNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class my1stTestNGClass {
  @Test
  public void f() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.policybazaar.com/");
	  	  
  }
}
