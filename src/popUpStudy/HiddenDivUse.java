package popUpStudy;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivUse {
    //****Hidden Division PopUp****
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	System.out.println(driver.findElement(By.xpath("//span[text()='Login']")).getText());
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	Thread.sleep(1000);
	driver.findElement(By.name("q")).sendKeys("hp gaming laptop i5 11th generation");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(1000);
    driver.navigate().forward();
    Thread.sleep(1000);
    //******Alert PopUp****
    driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
    driver.findElement(By.xpath("//input[@value='Confirmation Box']")).click();
    Alert alt = driver.switchTo().alert();
    Thread.sleep(2000);
    System.out.println(alt.getText());
    alt.accept();
    driver.navigate().forward();
    
    //***Child browser PopUp
    driver.get("https://skpatro.github.io/demo/links/");
    System.out.println(driver.findElement(By.tagName("b")).getText());
    Thread.sleep(1000);
    driver.findElement(By.name("NewWindow")).click();
    Thread.sleep(1000);
    //we need change focus from main page to child browser ---> we need windows ID's
     Set<String> allWindowsID = driver.getWindowHandles();
     ArrayList<String>al=new ArrayList<>(allWindowsID);
     String mainPageID=al.get(0);
     String childPageID=al.get(1);
   //now we can change focus from main page to child browser
     driver.switchTo().window(childPageID);
     driver.manage().window().maximize();
     System.out.println(driver.findElement(By.xpath("//h1[text()='Page not found']")).getText());
     driver.switchTo().window(mainPageID);
     Thread.sleep(2000);
     driver.quit();
     
     
    
	}

}
