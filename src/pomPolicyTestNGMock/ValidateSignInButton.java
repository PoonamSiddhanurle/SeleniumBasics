package pomPolicyTestNGMock;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateSignInButton {
	WebDriver driver;
	LoginPage login;
	@BeforeClass
	public void openBrowser()
	{
		driver=new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		login=new LoginPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
	}
	@BeforeMethod
	public void launchPolicyBazaar()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		login.ClickOnSignInButton();
		
		
	}
  @Test
   public void VerifyMobNumber() 
   {
	  login.enterMobNo();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
   }
}
