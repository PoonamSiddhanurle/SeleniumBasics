package webElementMethod;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class SendKeysUse {

	public static void main(String[] args) throws InterruptedException, IOException {
		/*WebElement methods are used to take actions elements present Webpage
		 * 1.sendkeys();
		 * 2.clear();
		 * 3.click();
		 * 4.getText();
		 * 5.isSelected();
		 * 6.isEnabled();
		 * 7.isDisplayed();
		 */
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.facebook.com/signup");
     Thread.sleep(1000);
     driver.manage().window().maximize();
     Thread.sleep(1000);
     WebElement name=driver.findElement(By.xpath("//input[@name='firstname']"));
     name.sendKeys("Poonam");
     Thread.sleep(1000);
     driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("Siddhanurle");
     Thread.sleep(1000);
     driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("siddhanurlepoonam2802@gmail.com");
     Thread.sleep(1000);
     WebElement passs= driver.findElement(By.xpath("//input[@id='password_step_input']"));
     System.out.println("String is "+passs.isEnabled());
     driver.findElement(By.xpath("//input[@aria-label='Re-enter email address']")).sendKeys("siddhanurlepoonam2802@gmail.com");
     //driver.findElement(By.xpath("//input[@aria-label='Re-enter email address']")).clear();
     Thread.sleep(1000);
     WebElement pass =driver.findElement(By.xpath("//input[@id='password_step_input']"));
     pass.click();
     pass.sendKeys("PoonamMahesh");
     //driver.findElement(By.xpath("//label[text()='Female']")).click();
     WebElement radioButton=driver.findElement(By.xpath("//label[text()='Female']"));
     radioButton.click();
     if(radioButton.isSelected())
     {
    	 System.out.println("Radio Button is already selected");
     }
     else
     {
    	 System.out.println("Selecting radio button");
    	 radioButton.click();
     }
     Thread.sleep(1000);
     WebElement info=driver.findElement(By.xpath("//p[contains(text(),'People who use')]"));
     System.out.println("String is--->"+info.getText());
     WebElement SDay=driver.findElement(By.xpath("//select[@id='day']"));
     Select s=new Select(SDay);
     s.selectByVisibleText("3");
     WebElement smonth=driver.findElement(By.xpath("//select[@id='month']"));
     Select m=new Select(smonth);
     m.selectByIndex(6);
     WebElement syear=driver.findElement(By.xpath("//select[@id='year']"));
     Select y=new Select(syear);
     y.selectByValue("1999");
     Thread.sleep(1000);
     //Screenshot
     //1. we need to type cast driver object to TakeScreenshot Interface i.e-->((Takescreenshot)driver)
     //2. Then we need to call the method getScreenShotAs()with passing the arguments i.e.--->(outputType.FILE)
     //3.and this method return object type is FILE 
     //4.File src=((TakeScreenshot)driver).getSchrrenshotAs(outputType.FILE)
     File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
     //System.out.println(src);-->stored in temporary memory
     //To store the desired location
     File dest=new File("C:\\Users\\mahes\\Videos\\Captures\\Selenium\\Screenshots\\abc1.png");
     FileHandler.copy(src, dest);
     Thread.sleep(1000);
     //driver.close();
     
     driver.navigate().forward();
     
     
     driver.get("https://auth.discoveryplus.in/login?flow=OTPLogin");
     driver.manage().window().maximize();
     Thread.sleep(1000);
     driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("9822501078");
     Thread.sleep(1000);
     WebElement OTP=driver.findElement(By.xpath("//button[text()='Get OTP']"));
     //OTP.click();
     boolean result=OTP.isEnabled();
     System.out.println("Get OTP status is "+result);
     driver.navigate().forward();
     
     driver.get("https://rahulshettyacademy.com/AutomationPractice/");
     WebElement textBox=driver.findElement(By.xpath("//input[@id='displayed-text']"));
     System.out.println(textBox.isDisplayed());
     if(textBox.isDisplayed())
     {
    	 System.out.println("Text box is displayed");
    	 textBox.sendKeys("Hello");
    	 Thread.sleep(1000);
     }
     else
     {
    	 System.out.println("TextBox is not display");
     }
     Thread.sleep(1000);
     
     driver.quit();
     
     
	}

}