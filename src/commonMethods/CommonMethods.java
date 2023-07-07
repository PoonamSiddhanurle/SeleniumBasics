package commonMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class CommonMethods {

    //Wait
	public static void implicitlyWait(WebDriver driver, long waittime)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waittime) );
	}
	
	//screenshot
	public static void captureScreenshot(WebDriver driver, String filename) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\mahes\\Videos\\Captures\\Selenium\\Screenshots\\"+filename+ ".png");
		FileHandler.copy(src, dest);
	}
	
	//Scrolling
	public static void scrolling(WebDriver driver, WebElement elements)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", elements);
	}
	
	//read data from excel
	public static String datafromExcel(int rollNum, int colNum) throws EncryptedDocumentException, IOException
	{ 
		FileInputStream myfile=new FileInputStream("C:\\Users\\mahes\\Videos\\Captures\\Jeera\\docs\\TC.xlsx");
		String value = WorkbookFactory.create(myfile).getSheet("Sheet2").getRow(rollNum).getCell(colNum).getStringCellValue();
		return value;
	
		
	}
}
