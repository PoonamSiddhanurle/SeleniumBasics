package scrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;




public class ScrollIntoView {

	public static void main(String[] args) throws InterruptedException {
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("disable-notifications");
	WebDriver driver=new ChromeDriver(opt);
	driver.manage().window().maximize();
	driver.get("https://www.justdial.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	WebElement activity = driver.findElement(By.xpath("//h2[text()='Popular Categories']"));
	//Actions act=new Actions(driver);
	//act.click(activity).perform();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(true)",activity);

	}

}
