package pomPolicyTestNGMock;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class BankLogin {
	@FindBy(xpath="/html/body/div/div/div[2]/div/div[1]/div[1]/button")private WebElement customerButton;
	@FindBy(id="userSelect/li")private WebElement UserName;
	
	//constructor
    public BankLogin(WebDriver driver)
    {
		PageFactory.initElements(driver,this);
	}
  
    //methods
	public void ClickOnCustomerLoginButton()
	{
		customerButton.click(); 
	}
	public void enterUserName()
	{
		UserName.click(); 
	}
  
}
