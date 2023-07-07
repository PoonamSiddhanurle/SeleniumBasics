package dropdownStudy;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxUse {

	public static void main(String[] args) throws InterruptedException {
		//***Dropdown or Listbox***
    WebDriver driver=new ChromeDriver();
    driver.get("http://www.uitestpractice.com/Students/Select#");
    Thread.sleep(2000);
    WebElement country = driver.findElement(By.xpath("//select[@id='countriesMultiple']"));
    Select s=new Select(country);
    s.selectByIndex(0);
    s.selectByValue("usa");
    s.selectByVisibleText("China");
    System.out.println("Multiple selectable status is "+s.isMultiple());
    Thread.sleep(2000);
    //s.deselectAll();
    System.out.println("****for each****");
    List<WebElement>allElements=s.getAllSelectedOptions();
    for(WebElement a:allElements)
    {
    	System.out.println(a.getText());//getText method is used to display the name or text
	}
    driver.close();
    
    
	}
	

}
