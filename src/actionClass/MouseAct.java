package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAct {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	Actions act=new Actions(driver);
	WebElement clickmeth = driver.findElement(By.xpath("//span[text()='right click me']"));
	WebElement doubleclickmeth = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
	act.click(clickmeth).perform();
	Thread.sleep(1000);
	act.contextClick(clickmeth).perform();
	Thread.sleep(1000);
	//act.moveToElement(clickmeth).perform();
	//Thread.sleep(1000);
	act.doubleClick(doubleclickmeth).perform();

	}

}
