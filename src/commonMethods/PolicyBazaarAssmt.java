package commonMethods;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
//import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;



public class PolicyBazaarAssmt {

	public static void main(String[] args) throws InterruptedException {
	//disable notifications
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("-disable-notifications");
	WebDriver driver=new ChromeDriver(opt);
	driver.manage().window().maximize();
	driver.get("https://www.policybazaar.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	
	//click on sign in button
	driver.findElement(By.xpath("//a[@class='sign-in']")).click();
	Thread.sleep(1000);
	
	//Enter mobile no
	driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys("8261072161");
	Thread.sleep(1000);
	
	//click on sign in with password button
	driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
	Thread.sleep(1000);
	
	//Enter Password
	driver.findElement(By.name("password")).sendKeys("poonam@1234");
	Thread.sleep(1000);
	
	//click on sign in button
	driver.findElement(By.xpath("//span[text()='Sign in']")).click();
	
	//click on My account button
	Thread.sleep(1000);
	Actions act=new Actions(driver);
	WebElement account = driver.findElement(By.xpath("//div[@class='userprofile']"));
	act.moveToElement(account).perform();
	
	//click on My profile
	driver.findElement(By.xpath("(//a[@class='ico-1'])[1]")).click();
	
	//Switch focus to child window
	Set<String> allWindowIDs = driver.getWindowHandles();//
	ArrayList<String>al=new ArrayList<>(allWindowIDs);
	String childWindowID = al.get(1);// ID of child window
	//switch selenium focus from main page to child window
	driver.switchTo().window(childWindowID);//now selenium will focus to child window
	Thread.sleep(1000);
	//performing action on child window
	
	
	//click on female radio button
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	WebElement radio1 = driver.findElement(By.xpath("//span[text()='Female']"));
	radio1.click();
	
	
	//Enter name
	driver.findElement(By.name("personName")).sendKeys("Poonam Siddhanurle");
	Thread.sleep(1000);
	
	//Enter EmailId
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("poonamsalunkhe@gmail.com");
	Thread.sleep(1000);
	
	//Enter Mobile No
	//field is not clickable on webpage
	
	//select on annual income
	driver.findElement(By.xpath("(//div[@aria-haspopup='listbox'])[1]")).click();
	List<WebElement> AnnualIncome = driver.findElements(By.xpath("//ul[@class='MuiList-root MuiMenu-list MuiList-padding']/li"));
	for(WebElement sr:AnnualIncome)
	{
	System.out.println(sr.getText());
	}
	for(WebElement sr:AnnualIncome)
	{

	String expectedResult="10 - 15 lakhs";
	Thread.sleep(100);
	if(expectedResult.equals(sr.getText()))
	{
	sr.click();
	break;
	}
	}
	
	//select marital status
		driver.findElement(By.xpath("(//div[@aria-haspopup='listbox'])[2]")).click();
		List<WebElement> maritalStatus = driver.findElements(By.xpath("//ul[@tabindex='-1']"));
		for(WebElement sr:maritalStatus)
		{
		System.out.println(sr.getText());
		}
		List<WebElement> maritalStatus1 = driver.findElements(By.xpath("//ul[@tabindex='-1']/li[2]"));
		for(WebElement sr:maritalStatus1)
		{

		String expectedResult="Married";
		Thread.sleep(100);
		if(expectedResult.equals(sr.getText()))
		{
		sr.click();
		break;
		}
		}
	
	// Date of birth
    driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("03071999");
    
    //scrolling
	JavascriptExecutor js = (JavascriptExecutor)driver;
	WebElement c = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
	js.executeScript("arguments[0].scrollIntoView(true);", c);
	Thread.sleep(1000);
	
	//Enter city name
	driver.findElement(By.xpath("(//input[@type='text'])[5]")).click();
	driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("p");
	List<WebElement> city = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
	for(WebElement sr:city)
	{
	System.out.println(sr.getText());
	}
	List<WebElement> cityNew = driver.findElements(By.xpath("(//div[@role='menuitem'])[2]"));
	for(WebElement sr:cityNew)
	{

	String expectedResult="Pakur,Jharkhand";
	Thread.sleep(100);
	if(expectedResult.equals(sr.getText()))
	{
	sr.click();
	break;
	}
	}
	}

}
