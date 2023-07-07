package pomPolicy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Testclass1 {

	public static void main(String[] args) throws InterruptedException {
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("disable-notifications");
	WebDriver driver=new ChromeDriver(opt);
	driver.manage().window().maximize();
	driver.get("https://www.policybazaar.com/");
	Thread.sleep(1000);
	LoginPageNew l=new LoginPageNew(driver);
	l.clickOnSignInButton();
	//l.enterMobileNumber(driver, null)
	

	}

}
