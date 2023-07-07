package syncronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitUse {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://discoveryplus.in/");
	WebDriverWait w=new WebDriverWait(driver, Duration.ofMillis(3000));
	w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h6[text()='Buy Plan'])[2]")));
	WebElement buyButton =driver.findElement(By.xpath("(//h6[text()='Buy Plan'])[2]"));
	buyButton.click();
	}

}
