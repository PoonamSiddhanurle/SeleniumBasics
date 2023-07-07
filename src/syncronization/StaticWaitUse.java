package syncronization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWaitUse {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/signup");
	Thread.sleep(1000);
	driver.manage().window().maximize();
	driver.close();

	

	}

}
