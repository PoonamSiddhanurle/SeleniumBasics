package miscellenousTopic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RatingsAndReview {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("disable-notification");
		opt.addArguments("--disable-popup-blocking");
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(1000);
		WebElement searchResult = driver.findElement(By.name("q"));
		searchResult.sendKeys("led");
		driver.findElements(By.xpath(""));
		
		
	}

}
