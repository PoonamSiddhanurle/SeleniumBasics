package iframeStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IFrameNew {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
	Thread.sleep(1000);
	WebElement str1=driver.findElement(By.xpath("//label[text()='Topic : ']"));
	WebElement str=driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']"));
	System.out.println(str1.getText()+str.getText());
	Thread.sleep(2000);
	//we need switch from main frame to frame1
	driver.switchTo().frame("frame1");
	System.out.println(driver.findElement(By.id("topic")).getText());
	driver.findElement(By.tagName("input")).sendKeys("Selenium");
	Thread.sleep(2000);
	//we need switch from frame1 to frame3
	driver.switchTo().frame("frame3");
	String str2=driver.findElement(By.xpath("//b[text()='Inner Frame Check box :']")).getText();
	System.out.println("frame3 text "+str2);
	driver.findElement(By.id("a")).click();
	//we need switch from frame3 to main frame
	driver.switchTo().defaultContent();
	//we need switch from main frame to frame2
	driver.switchTo().frame("frame2");
	WebElement animal=driver.findElement(By.id("animals"));
	Select s=new Select(animal);
	s.selectByVisibleText("Avatar");
	Thread.sleep(2000);
	driver.close();
	}
}
