package pomPolicyTestNGMock;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		List<WebElement> contents = driver.findElements(By.xpath("//*[@id=\"content\"]"));
		List<WebElement> li=new ArrayList<>(contents);
		for(WebElement sr:li)
		{
		System.out.println(sr.getText());
		}
	}
}
