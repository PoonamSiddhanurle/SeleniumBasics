package seleniumMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelMethod {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	//driver.get("https://paytm.com/dth-recharge/sun-direct");
   //driver.findElement(By.xpath("//label[text()='Registered Mobile No./Smart Card Number']")).sendKeys("9587845645");
   driver.get("https://www.redbus.in/");
   String Title=driver.getTitle();
   System.out.println("Title is="+Title);
	}

}
