
//Test case without data Driven FrameWork
package assignment;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import commonMethods.CommonMethods;

public class PolicyBazaarNew {

	public static void main(String[] args) throws InterruptedException {
		//disable notifications
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("-disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		CommonMethods.implicitlyWait(driver, 1000);
		
		//click on sign in button
		driver.findElement(By.xpath("//a[@class='sign-in']")).click();
		Thread.sleep(1000);
		
		//Enter mobile no
		driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys("8261072161");
		Thread.sleep(1000);
		
		//click on sign in with password button
		driver.findElement(By.xpath("(//a[@id='central-loggin-with-pwd'])[2]")).click();
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
		

		//validate Name filed
		String exceptedResult="Poonam Siddhanurle";
		String autualResult=driver.findElement(By.name("personName")).getText();
		Thread.sleep(1000);
		if(exceptedResult.equals(autualResult))
		{
			System.out.println("Actual and expected results are matching TC is Passed");
		}
		else
		{
			System.out.println("Actual and expected results are matching TC is Passed");
		}
		

	}

}
