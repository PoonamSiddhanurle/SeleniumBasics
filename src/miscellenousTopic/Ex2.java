package miscellenousTopic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2 {

	public static void main(String[] args) throws InterruptedException {
		//how to find review and ratings --dynamic numbers
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	//Closing Hidden Division Popup
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	driver.findElement(By.name("q")).sendKeys("led");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(1000);
	WebElement review = driver.findElement(By.xpath("(//div[@class='col col-7-12'][1]//span)[6]"));
    System.out.println("Reviews are "+review.getText());
    WebElement ratings=driver.findElement(By.xpath("(//div[@class='col col-7-12'][1]//span)[4]"));
    System.out.println("Ratings are "+ratings.getText());
    Thread.sleep(1000);
    driver.quit();
	}

}
