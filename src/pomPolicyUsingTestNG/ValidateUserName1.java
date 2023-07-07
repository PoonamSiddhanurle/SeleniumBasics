package pomPolicyUsingTestNG;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

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
public class ValidateUserName1 extends Base{
	//Object creations
  PolicyBazaar pb;
  MyAccountPageNew myAcc;
  
  
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
  }
}
