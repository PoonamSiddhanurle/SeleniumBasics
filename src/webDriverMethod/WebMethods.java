package webDriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebMethods {
	
	/*1.driver.get();
	2.driver.close();
	3.driver.quit();
	4.driver.minimize();
	5.driver.maximize();
	6.driver.navigate()--->open browser, refresh, forward, backward
	7.driver.getTitle
	8.driver.getCurrentUrl*/

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.get("https://www.instagram.com/");
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.whatsapp.com/");
		Thread.sleep(10000);
		driver.navigate().back();
		Thread.sleep(10000);
		driver.navigate().forward();
		Thread.sleep(10000);
		driver.navigate().refresh();
		Thread.sleep(10000);
		String myTitle=driver.getTitle();
		System.out.println("The current Title is "+myTitle);
		String url=driver.getCurrentUrl();
		System.out.println("The current url is "+url);
		driver.quit();
        
	}

}
