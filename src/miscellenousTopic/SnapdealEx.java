package miscellenousTopic;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapdealEx {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.snapdeal.com/");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//button[text()='NOT NOW']")).click();
    driver.findElement(By.id("inputValEnter")).sendKeys("shoes");
    Thread.sleep(1000);
    List<WebElement> SearchResult = driver.findElements(By.xpath("//ul[@class='suggestionList_menu']/li"));
    for(WebElement sr:SearchResult)
    {
    	System.out.println(sr.getText());
    }
    for(WebElement sr:SearchResult)
    {
    	String exceptedResult="Black Formal Shoes";
    	Thread.sleep(1000);
    	if(exceptedResult.equals(sr.getText()))
    	{
    		sr.click();     
    		break;
    	}
    	//driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
    	//driver.findElement(By.xpath("//img[(@title='UrbanMark Men Comfortable Round Toe Derby Formal Shoes- Black']")).click();
    			
    }
	}

}
