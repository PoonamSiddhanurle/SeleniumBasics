package testClassUse;

import java.util.ArrayList;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import baseClass.Base;
import pomClass.MyAccountPageNew;
import pomClass.PolicyBazaar;
import utilityClass.Utility;

@Listeners(pomPolicyUsingTestNG.Listener.class)
public class ValidateUserNameByUsingExcel extends Base{
	//Object creations
  PolicyBazaar pb;
  MyAccountPageNew myAcc;
  String PB_TC_1234;
  
  @BeforeClass
  public void openBrowser() throws InterruptedException
  {   
	  Thread.sleep(1000);
	  launchBrowser();
	  pb=new PolicyBazaar(driver);
	  myAcc=new MyAccountPageNew(driver);
  }
  @BeforeMethod
  public void enterDetailse()
  {
	  
	  Utility.implicitWait(driver, 1000);
	  pb.clickSignInButton();
	  Utility.implicitWait(driver, 1000);
	  pb.enterMobileNumber();
	  Utility.implicitWait(driver, 1000);
	  pb.clickonPasswordButton();
	  Utility.implicitWait(driver, 1000);
	  pb.enterPassword();
	  Utility.implicitWait(driver, 1000);
	  pb.clickOnSignInButton();
	  Utility.implicitWait(driver, 1000);
	  pb.clickmyAccount();
	  Utility.implicitWait(driver, 1000);
	  pb.clickOnMyProfileButton();
	  Utility.implicitWait(driver, 1000);
	  Set<String> allpageId = driver.getWindowHandles();
	  List<String>l=new ArrayList<>(allpageId);
	  Utility.implicitWait(driver, 1000);
	  driver.switchTo().window(l.get(1));
	  Utility.implicitWait(driver, 1000);
	  myAcc.clickOnUserName();
  }
  @Test
  public void verifyUserName() 
  {
	  
	  String expectedUn="Poonam Siddhanurle";
	  String actualUn=myAcc.getActualUn("Poonam Siddhanurle");
	  //Assert.assertEquals(actualUn,expected_userName, "TC is failed exp and acutal are not match");
	  
  }
}
