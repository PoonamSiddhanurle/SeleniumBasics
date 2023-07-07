package utilityClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class Utility {
    
	//wait
	public static void implicitWait(WebDriver driver, long WaitTime)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(WaitTime));
	}
	//screenshot
	public static void takeScreenshot(WebDriver driver,String fileName) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\mahes\\Videos\\Captures\\Selenium\\Screenshots\\"+fileName+".png");
		FileHandler.copy(src, dest);
	}
	
	//scrolling
	public static void scrolling(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].ScrollIntoView(true)", element);
	}
	//ReaddataFromExcel
	public String readDataFromExcel(int row, int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream myFile=new FileInputStream("C:\\Users\\mahes\\Videos\\Captures\\Jeera\\docs\\TC.xlsx");
		String Value = WorkbookFactory.create(myFile).getSheet("Sheet2").getRow(row).getCell(cell).getStringCellValue();
		return Value;
		
	}
	public String readDataFromPropertyFile(String key) throws IOException
	{
		Properties prop=new Properties();
		FileInputStream myFile=new FileInputStream("C:\\Users\\mahes\\eclipse-workspace\\seleniumBasics\\myProperty.properties");
		prop.load(myFile);
		String value = prop.getProperty(key);
		return value;
	}
	
}
