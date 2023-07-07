package setSizeandPosition;

 import org.openqa.selenium.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeEx {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		//get the default window size
		System.out.println(driver.manage().window().getSize());
		//create an object of dimension class and pass x and y values
		Dimension d1=new Dimension(500, 200);
		//set the values
		driver.manage().window().setSize(d1);
	}

}
