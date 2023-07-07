package pomPolicyTestNGMock;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	//variable
	@FindBy(xpath="/html/body/div[5]/div[2]/div/ul/li[7]/a")private WebElement SignInButton;
	@FindBy(xpath="(//input[@type='number'])[2]")private WebElement MobileNum;
	
	//constructor
    public LoginPage(WebDriver driver)
    {
		PageFactory.initElements(driver,this);
	}
  
    //methods
	public void ClickOnSignInButton()
	{
		SignInButton.click(); 
	}
	public void enterMobNo()
	{
		MobileNum.sendKeys("9067911404"); 
	}
  
}
