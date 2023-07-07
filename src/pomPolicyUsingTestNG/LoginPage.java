package pomPolicyUsingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	//variable
	@FindBy(xpath="//a[@class='sign-in']")private WebElement signInButton;
	@FindBy(xpath="(//input[@type='number'])[2]")private WebElement mobNumber;
	@FindBy(xpath="(//a[@id='central-loggin-with-pwd'])[2]")private WebElement signInWithPassword;
	@FindBy(name="password")private WebElement password;
	@FindBy(xpath="//span[text()='Sign in']")private WebElement SignIn;
	@FindBy(xpath="//div[@class='userprofile']")private WebElement myAccount;
	@FindBy(xpath="//span[text()=' My profile ']")private WebElement myProfile;
	
	//constructor
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//methods
  
  public void clickOnHomePageSignInButton() 
  {
	  signInButton.click();
  }
  public void enterMobileNumber()
  {
	  mobNumber.sendKeys("8261072161");
  }
  public void clickOnSignInWithPwd()
  {
	  signInWithPassword.click();
  }
  public void enterPassword()
  {
	  password.sendKeys("poonam@1234");
  }
  public void clickOnSignInButton()
  {
	  SignIn.click();
  }
  public void clicOnMyAccountPage()
  {
	  myAccount.click();
  }
  public void clickOnMyProfileButton()
  {
	  myProfile.click();
  }
}
