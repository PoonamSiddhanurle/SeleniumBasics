package commonMethods;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	//wait
	CommonMethods.implicitlyWait(driver, 3000);
	//scrolling
	WebElement todayDeal = driver.findElement(By.xpath("//h2[text()='Today’s Deals']"));
	CommonMethods.scrolling(driver, todayDeal);
	todayDeal.getText();
	//Screenshot
	CommonMethods.captureScreenshot(driver, "amazonscr");
	//read data from excel
	System.out.println(CommonMethods.datafromExcel(1, 0));
	}

}
