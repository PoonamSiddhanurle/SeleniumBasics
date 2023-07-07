package setSizeandPosition;

import org.openqa.selenium.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.naukri.com/");
	Thread.sleep(1000);
	//get default position of window
	System.out.println(driver.manage().window().getPosition());//-->(-8, -8)
	//creating object of point class and pass x and y values
    Point p=new Point(2,4);
    //set the position
    driver.manage().window().setPosition(p);

	}

}
