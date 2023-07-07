package pomPolicy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import commonMethods.CommonMethods;

public class TestUserName {

	public static void main(String[] args) throws InterruptedException {
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("-disable-notifications");
	WebDriver driver=new ChromeDriver(opt);
	driver.manage().window().maximize();
	driver.get("https://www.policybazaar.com/");
	CommonMethods.implicitlyWait(driver, 1000);
	
	//create object of login page
	LoginPage l=new LoginPage(driver);
	l.clickonsignInButton();
	Thread.sleep(1000);
	l.enterMobNumber("8261072161");
	Thread.sleep(1000);
	l.clickSignInPasswordButton();
	Thread.sleep(1000);
	l.enterPassword("poonam@1234");
	Thread.sleep(1000);
	l.clickSignInButton();
	Thread.sleep(1000);
	l.clickmyAccount();
	
	
	
	}

}
