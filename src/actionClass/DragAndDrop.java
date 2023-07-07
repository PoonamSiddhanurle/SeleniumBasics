package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		Actions act=new Actions(driver);
		WebElement dragSource = driver.findElement(By.xpath("(//a[(@style='color:#FFFFFF;')])[4]"));
		WebElement dropTarget = driver.findElement(By.xpath("(//li[(@class='placeholder')])[4]"));
		act.dragAndDrop(dragSource, dropTarget).perform();
		Thread.sleep(1000);
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", dropTarget);
		//act.scrollToElement(dropTarget).perform();
	

	}

}
