package webElementMethod;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://paytm.com/recharge");
		Thread.sleep(2000);
		String random=RandomString.make(2);
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest1=new File("C:\\Users\\mahes\\Videos\\Captures\\Selenium\\Screenshots\\sfdg"+random+".png");
		FileHandler.copy(src, dest1);
		driver.manage().window().maximize();
		driver.navigate().forward();
		driver.get("https://www.youtube.com/");
	    Thread.sleep(2000);
		driver.quit();
		
	}

}
