package testClassUse;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseClass.Base2;
import pomClass.XyzBankPom1;

public class ValidateXyzBank extends Base2 {
	XyzBankPom1 bank;
  @BeforeClass
  public void launchUrl() throws InterruptedException
  {
	  launchBrowser();
	  Thread.sleep(1000);
	  bank=new XyzBankPom1(driver);
  }
  @Test
  public void validateloginButton() throws InterruptedException 
  {
	  Thread.sleep(1000);
	  bank.clickOnCustomerLoginButton();
	  Reporter.log("customer login button is clickable");
	  
  }
  @Test
  public void validateUserName() throws InterruptedException
  {
	  Thread.sleep(1000);
	  bank.clickOnYourName();
	Select s=new Select(super.yourName);
	  s.selectByIndex(2);
	  
	  
	  Reporter.log("your Name is clickable");
  }
//  @Test
//  public void chooseName() throws InterruptedException
//  {
//	  Thread.sleep(1000);
//	  String exp_name="Harry Potter";
//	  String act_name=bank.selectName(exp_name);
//	  Assert.assertEquals(exp_name, act_name,"TC is failed actual and expected result are not match");
//	  Reporter.log("Name is clickable");
//  }
}
