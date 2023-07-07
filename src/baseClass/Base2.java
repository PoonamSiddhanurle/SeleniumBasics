package baseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Base2 
{
	
	protected WebDriver driver;
	public WebElement yourName;
    public void launchBrowser() throws InterruptedException
{
    ChromeOptions opt=new ChromeOptions();
    opt.addArguments("disable-notifications");
    driver=new ChromeDriver(opt);
    Thread.sleep(1000);
    driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
    driver.manage().window().maximize();
    //Thread.sleep(1000);
    //driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
}
}
