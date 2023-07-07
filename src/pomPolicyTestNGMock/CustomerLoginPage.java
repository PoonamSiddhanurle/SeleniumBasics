package pomPolicyTestNGMock;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomerLoginPage {
WebDriver driver;
BankLogin login;
@BeforeClass
public void openBrowser()
{
	driver=new ChromeDriver();
	driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject");
	login=new BankLogin(driver);
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	
}
@BeforeMethod
public void launchurl()
{
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	login.ClickOnCustomerLoginButton();;
	
	
}
@Test
public void VerifyName() 
{
  login.enterUserName();
  
  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
}
}
