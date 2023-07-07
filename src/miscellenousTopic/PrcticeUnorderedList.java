package miscellenousTopic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PrcticeUnorderedList {

	public static void main(String[] args) throws InterruptedException {
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("disable-notification");
	opt.addArguments("--disable-popup-blocking");
	WebDriver driver=new ChromeDriver(opt);
	driver.get("https://www.google.com/?authuser=0");
	Thread.sleep(1000);
	driver.findElement(By.name("q")).sendKeys("tvs");
	Thread.sleep(1000);
	List<WebElement> list = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
	for(WebElement li:list)
	{
		System.out.println(li.getText());
	}
	for(WebElement li:list)
	{
		String expectedResult="tvs iqube";
		if(expectedResult.equals(li.getText()))
		{
			li.click();
			break;
		}
	}
		
	}

	

}
