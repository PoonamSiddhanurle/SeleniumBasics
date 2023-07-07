package pomPolicyExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {

	//variables
	@FindBy(name="personName")private WebElement userName;
	
	//constructor
	public MyAccountPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//methods
	public void validateUserName(String exceptedUN)
	{
	   String actualUN=userName.getText();
	   if(exceptedUN.equals(actualUN))
	   {
		   System.out.println("Actual and Expected user Names are matching TC is Passed");
	   }
	   else
	   {
		   System.out.println("Actual and Expected user Names are not matching TC is Failed");
	   }  
	
	}
	public void enterUserName(String actualUN)
	{
		userName.sendKeys(actualUN);
		
	}
}
