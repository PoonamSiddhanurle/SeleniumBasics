package webTable;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RowReading {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		//how to read single row data value
		WebElement data = driver.findElement(By.xpath("//table[@class='dataTable']//tr[1]/td[1]"));
		System.out.println(data.getText()+" ");
		//how to read single row data
        List<WebElement> data1 = driver.findElements(By.xpath("//table[@class='dataTable']//tr[1]/td"));
        Iterator<WebElement>it=data1.iterator();
        while(it.hasNext())
        {
        	System.out.print(it.next().getText()+" ");
        }
        System.out.println();
      //how to read header row
        //row=1, start=1, end=5
        
        for(int i=1; i<=5;i++)
        {
        	WebElement data2 = driver.findElement(By.xpath("//table[@class='dataTable']//tr//th["+i+"]"));
        	System.out.print(data2.getText()+" ");
        }
        System.out.println();
      //how to read all rows data from table
       //rows=26, start=1, end=26
        for(int i=1; i<=26; i++)//----outer for loop for rows
        {
        	for(int j=1; j<=5;j++)//----inner for loop for column
        	{
        		WebElement data3 = driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i+"]//td["+j+"]"));
            	System.out.print(data3.getText()+" || ");
        	}
        	System.out.println();
   
        }
	}

}
