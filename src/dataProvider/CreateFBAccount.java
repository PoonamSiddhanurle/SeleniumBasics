package dataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import commonMethods.CommonMethods;

public class CreateFBAccount {
  @Test(dataProvider="rediff",dataProviderClass=DataProviderTest.class)
  public void fbAcc(String firstname,String lastname,String mobNum) throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	  driver.manage().window().maximize();
	  CommonMethods.implicitlyWait(driver, 1000);
	  driver.findElement(By.name("firstname")).sendKeys(firstname);
	  Thread.sleep(1000);
	  driver.findElement(By.name("lastname")).sendKeys(lastname);
	  Thread.sleep(1000);
	  driver.findElement(By.name("reg_email__")).sendKeys(mobNum);
	  Thread.sleep(1000);
  }
}
