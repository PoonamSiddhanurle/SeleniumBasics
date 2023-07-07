package pomPolicy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class LoginPageNew {
	//variable
	@FindBy (xpath="//a[@class='sign-in']")private WebElement signInButton;
	@FindBy(xpath="(//input[@type='number'])[2]")private WebElement MobNum;
	@FindBy(xpath="(//a[@id='central-loggin-with-pwd'])[2]")private WebElement SignPwd;
	@FindBy(name="password")private WebElement Password;
	//constructor
	public LoginPageNew(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	//Methods
    public void clickOnSignInButton()
    {
    	signInButton.click();
    
	}
    public void enterMobileNumber(String mn)
    {
    	
    	MobNum.sendKeys(mn);
    }
    public void clickOnSignInwithPasswordButton()
    {
    	SignPwd.click();
    }
    public void enterPassword(String pwd)
    {
    	Password.sendKeys(pwd);
    }

}
