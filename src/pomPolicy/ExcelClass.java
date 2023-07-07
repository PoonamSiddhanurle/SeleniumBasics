package pomPolicy;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import commonMethods.CommonMethods;



public class ExcelClass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("disable-notifications");
	WebDriver driver=new ChromeDriver(opt);
	driver.manage().window().maximize();
	driver.get("https://www.policybazaar.com/");
	Thread.sleep(1000);
    LoginPageNew l=new LoginPageNew(driver);
    l.clickOnSignInButton();
    Thread.sleep(1000);
    l.enterMobileNumber(CommonMethods.datafromExcel(0, 1));
    Thread.sleep(1000);
    l.clickOnSignInwithPasswordButton();
    Thread.sleep(1000);
    l.enterPassword(CommonMethods.datafromExcel(0, 2));
    
    
	
	
	}
}
