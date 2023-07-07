package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class XyzBankPom1 
{
//variable
 	@FindBy(xpath="/html/body/div/div/div[2]/div/div[1]/div[1]/button")private WebElement custmerLogin;
 	@FindBy(xpath="//select[@name='userSelect']")private WebElement yourName;
// 	@FindBy(xpath="//option[@value='2']")private WebElement name;
// 	@FindBy(xpath="//button[@type='submit']")private WebElement login;
//constructor
 	public XyzBankPom1(WebDriver driver)
 	{
 		PageFactory.initElements(driver,this);
 	}
//methods
 	public void clickOnCustomerLoginButton() 
 	{
 		custmerLogin.click();
 	}
 	public void clickOnYourName()
 	{
 		yourName.click();
 		
 	}
// 	public String selectName(String exp_name)
// 	{
// 		name.click();
//		return exp_name;
// 	}
// 	public void clickOnLoginButton()
// 	{
// 		login.click();
// 	}
}
