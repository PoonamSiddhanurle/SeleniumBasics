package pomPolicyExcel;

import java.io.IOException;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import commonMethods.CommonMethods;


public class POMPolicyAssmt {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		//open the Webpage
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("-disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		CommonMethods.implicitlyWait(driver, 1000);
		
		//click on sign in Button
		LoginPage l=new LoginPage(driver);
		l.clickonsignInButton();
		l.enterMobNumber(CommonMethods.datafromExcel(0, 1));
		Thread.sleep(1000);
		l.clickSignInPasswordButton();
		l.enterPassword(CommonMethods.datafromExcel(0, 2));
		Thread.sleep(1000);
		l.clickSignInButton();
		l.clickmyAccount();
		l.clickOnMyProfileButton();
		Thread.sleep(1000);
		
		//new tab will be opened, we need to switch to new tab
		Set<String> allId = driver.getWindowHandles();
		List<String> al=new ArrayList<>(allId);
		
		//switching focus to myAccount page
		driver.switchTo().window(al.get(1));
		
		//create object of myAccountPage class
		Thread.sleep(1000);
		System.out.println(CommonMethods.datafromExcel(0, 0));	
		MyAccountPage myACC=new MyAccountPage(driver);
		myACC.enterUserName(CommonMethods.datafromExcel(0, 0));
	    myACC.validateUserName(CommonMethods.datafromExcel(0, 0));
	    
	    
		
		

	}

}
