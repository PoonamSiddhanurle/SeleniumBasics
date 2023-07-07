package syncronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitUse {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://discoveryplus.in/");
	Wait<WebDriver>w=new FluentWait<WebDriver>(driver).
			withTimeout(Duration.ofMillis(3000)).
			pollingEvery(Duration.ofMillis(3000)).
			ignoring(NoSuchElementException.class);
	w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h6[text()='Buy Plan'])[2]")));
	driver.findElement(By.xpath("(//h6[text()='Buy Plan'])[2]")).click();
    
	}

}
