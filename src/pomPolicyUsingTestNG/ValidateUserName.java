package pomPolicyUsingTestNG;

import java.time.Duration;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class ValidateUserName {
    //creating object of POM classes and WebDriver class 
	WebDriver driver;
	LoginPage login;
	MyAccountPage1 myAcc;
  @BeforeClass
  public void launchPolicyBazaar()
  {
	  ChromeOptions opt=new  ChromeOptions();
	  opt.addArguments("disable-notifications");
	  driver=new ChromeDriver(opt);
	  driver.get("https://www.policybazaar.com/");
	  driver.manage().window().maximize();
	  login=new LoginPage(driver);
	  myAcc=new MyAccountPage1(driver);
  }
  @BeforeMethod
  public void loginToPoilcyBazaar() throws InterruptedException
  {
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
    login.clickOnHomePageSignInButton();
    login.enterMobileNumber();
    Thread.sleep(1000);
    login.clickOnSignInWithPwd();
    Thread.sleep(1000);
    login.enterPassword();
    Thread.sleep(1000);
    login.clickOnSignInButton();
    Thread.sleep(1000);
    login.clicOnMyAccountPage();
    Thread.sleep(1000);
    login.clickOnMyProfileButton();
    Thread.sleep(1000);
    Set<String> allWindowID = driver.getWindowHandles();
    List<String>ChildPageID=new ArrayList<>(allWindowID);
    //switching focus from main page to child page
    driver.switchTo().window(ChildPageID.get(1));
  }
  @Test(priority=-1)
  public void verifyUserName() throws InterruptedException 
  {   
	  Thread.sleep(1000);
	  String expectedUN="Poonam Siddhanurle" ;
	  Thread.sleep(1000);
	  String actualUN=myAcc.getActualUN(expectedUN);
	  Assert.assertEquals(expectedUN, actualUN, "TC is failed actual and expected are not mathed");
	  myAcc.clickonEmailButton();	
	  Thread.sleep(1000);
	  String expectedMail="poonamsalunkhe@gmail.com" ;
	  Thread.sleep(1000);
	  String actualMail=myAcc.getEmailID(expectedMail);
	  Assert.assertEquals(expectedMail, actualMail, "TC is failed actual and expected are not mathed");
	
  }
//  public void verifyGender() throws InterruptedException
//  {
//	  Thread.sleep(1000);
//	  myAcc.usergender(); 
//  }
  @Test(priority=1)
  public void verifyMailID() throws InterruptedException
  {   
	  Thread.sleep(1000);
	  
	 
  }
}
