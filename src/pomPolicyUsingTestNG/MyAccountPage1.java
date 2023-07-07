package pomPolicyUsingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage1 {

	//variable
		@FindBy(name="personName")private WebElement userName;
		@FindBy(xpath="//span[text()='Female']")private WebElement gender;
		@FindBy(xpath="//input[@name='email']")private WebElement email;
		
		
		//constructor
		public MyAccountPage1(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
		}
		//methods
	  public String getActualUN(String un) 
	  {
//		 String actualUN=userName.getText();
//		 return actualUN;
		 userName.sendKeys("Poonam Siddhanurle");
		 return un;
	  }
	  public void usergender()
	  {
		  gender.click();
	  }
	  public void clickonEmailButton()
	  {   

		 email.click();
	  }
	
	  public String getEmailID(String ID) throws InterruptedException
	  {   
		  Thread.sleep(1000);
	      email.sendKeys("poonamsalunkhe@gmail.com");
          return ID;
	  }
	

}
