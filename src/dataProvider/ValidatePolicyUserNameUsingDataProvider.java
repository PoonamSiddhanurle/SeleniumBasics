package dataProvider;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import commonMethods.CommonMethods;
import pomClass.MyAccountPageNew;
import pomClass.PolicyBazaar;

public class ValidatePolicyUserNameUsingDataProvider {
  WebDriver driver;
  PolicyBazaar login;
  MyAccountPageNew myAcc;
  @BeforeMethod()
  public void loginToPolicyBazaar()
  {
	  driver=new ChromeDriver();
	  driver.get("https://www.policybazaar.com/");
	  driver.manage().window().maximize();
	  login=new PolicyBazaar(driver);
	  myAcc=new MyAccountPageNew(driver);
	  
  }
  @Test(dataProvider="PolicyBazaarData",dataProviderClass=PolicyDataProvider.class)
  public void verifyUserName(String mobNum, String pwd, String expUN)
  {
	CommonMethods.implicitlyWait(driver, 1000);
	login.clickSignInButton();
	CommonMethods.implicitlyWait(driver, 1000);
	login.enterMobileNumber();
	CommonMethods.implicitlyWait(driver, 1000);
	login.clickonPasswordButton();
	CommonMethods.implicitlyWait(driver, 1000);
	login.enterPassword();
	CommonMethods.implicitlyWait(driver, 1000);
	login.clickOnSignInButton();
	CommonMethods.implicitlyWait(driver, 1000);
	login.clickmyAccount();
	CommonMethods.implicitlyWait(driver, 1000);
	login.clickOnMyProfileButton();
	CommonMethods.implicitlyWait(driver, 1000);
	Set<String> allWindowID = driver.getWindowHandles();
	List<String>l=new ArrayList<>(allWindowID);
	//switching focus from main page to child page
	driver.switchTo().window(l.get(1));
	myAcc.clickOnUserName();
	CommonMethods.implicitlyWait(driver, 1000);
	String expectedUn="Poonam Siddhanurle";
	String actualUn=myAcc.getActualUn("Poonam Siddhanurle");
  }
	
}
