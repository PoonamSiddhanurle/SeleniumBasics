package seleniumStudy1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenshotUse {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String random=RandomString.make(3);
		File dfg = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dfg1=new File("C:\\Users\\mahes\\Videos\\Captures\\Selenium\\Screenshots\\uiy"+random+"png");
		FileHandler.copy(dfg, dfg1);
		

	}

}
