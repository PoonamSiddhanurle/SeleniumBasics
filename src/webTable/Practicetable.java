package webTable;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practicetable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		//how to read table heading
        List<WebElement> heading = driver.findElements(By.tagName("th"));
        Iterator<WebElement>it=heading.iterator();
        while(it.hasNext())
        {
        	System.out.print(it.next().getText()+ " ");
        }
        System.out.println();
       //how to read single table heading
        WebElement singalheading = driver.findElement(By.xpath("//table[@class='dataTable']//th[3]"));
        System.out.println(singalheading.getText());
        Thread.sleep(1000);
        //how to read single row
        WebElement SingalRow = driver.findElement(By.xpath("//table[@class='dataTable']//tr[2]"));
        System.out.println(SingalRow.getText()+ " ");
      //how to read Multiple table rows
        
        for(int i=1; i<=26 ;i++)
        {
        	for(int j=1; j<=5;j++)
        {
        	WebElement MultipleRow = driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i+"]/td["+j+"]"));
        	System.out.print(MultipleRow.getText()+ " || ");
        }
        System.out.println();
        
        }
	}

}
