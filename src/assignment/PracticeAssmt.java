package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeAssmt {

	public static void main(String[] args) throws InterruptedException {
		//Open the url
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.neostox.com/sign-in");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		//click sign in account
		driver.findElement(By.xpath("(//a[text()='Sign In'])[1]")).click();
        Thread.sleep(1000);
        //Enter mobile number
        driver.findElement(By.xpath("//input[@type='number']")).sendKeys("9067911404");
        Thread.sleep(1000);
        //click on sign in button
        driver.findElement(By.xpath("(//a[text()='Sign In'])[2]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        //Enter password
        driver.findElement(By.id("txt_accesspin")).sendKeys("2802");
        Thread.sleep(1000);
        //click on submit button
        driver.findElement(By.id("lnk_submitaccesspin")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
        //close hidden division popup
        driver.findElement(By.xpath("(//span[text()='×'])[19]")).click();
        Thread.sleep(1000);
       //close hidden division popup
        driver.findElement(By.xpath("(//span[text()='×'])[36]")).click();
       //refresh the page
        driver.navigate().refresh();
        Thread.sleep(1000);
       //close hidden division popup
        driver.findElement(By.xpath("(//span[text()='×'])[36]")).click();
        Thread.sleep(1000);
        //get virtual money balance by using getText()
        WebElement balance = driver.findElement(By.id("lbl_curbalancetop"));
        System.out.println("Virtual money is "+balance.getText());
        balance.click();
        Thread.sleep(1000);
        //click on logOut
        driver.findElement(By.xpath("(//span[@class='px-3'])[10]")).click();
        
	}

}
