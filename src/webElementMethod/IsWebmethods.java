package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsWebmethods {

	public static void main(String[] args) {
		/*Return type of ismethod is boolean
		 * 1.isEnabled
		 * 2.isSelected
		 * 3.isDisplayed
		 */
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.linkedin.com/login");
    /*1.isSelected
     * Excepted text=From product backlog
     * Expected result=Stay updated on your professional world
     * Actual Result=from web page
     * Actual result=Stay updated on your professional world
     */
    String exptext="Stay updated on your professional world";
    String actualText=driver.findElement(By.xpath("//p[text()='Stay updated on your professional world']")).getText();
    if(exptext.equals(actualText))
    {
    	System.out.println("Actual and Expected text are match so TC is pass");
    }
    else
    {
    	System.out.println("Actual and Expected text are not match so TC is fail");
    } 
    driver.quit();
	}
	/*2.isEnabled()
	 */
	
	
   
}
