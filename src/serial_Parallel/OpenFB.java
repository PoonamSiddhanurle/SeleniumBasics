package serial_Parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenFB {
  @Test
  public void fb() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
  }
}
