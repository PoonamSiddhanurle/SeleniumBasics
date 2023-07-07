package scrolling;

import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EX1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.guru99.com/selenium-tutorial.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		WebElement tutorial = driver.findElement(By.xpath("//h3[text()='Selenium WebDriver Basics Tutorial']"));
		Thread.sleep(2000);
		//ScrollIntoView
        //JavascriptExecutor js=(JavascriptExecutor)driver;
        //js.executeScript("arguments[0].scrollIntoView(true)", tutorial);
        Actions act=new Actions(driver);
        act.scrollToElement(tutorial).perform();
        
	}

}
