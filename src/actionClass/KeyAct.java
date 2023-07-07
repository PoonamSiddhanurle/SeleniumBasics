package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyAct {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.findElement(By.linkText("Create new account")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		WebElement day = driver.findElement(By.id("day"));
		// create an object of Actions class
		Actions act= new Actions(driver);
		Thread.sleep(1000);
		//act.sendKeys(day, Keys.HOME, Keys.ENTER).perform();

		act.click(day).perform();// to open list options
		for(int i=1;i<=7;i++)
		{
		Thread.sleep(100);
		act.sendKeys(day, Keys.ARROW_UP).perform();
		}
		act.sendKeys(day, Keys.ENTER).perform();
		}
}
