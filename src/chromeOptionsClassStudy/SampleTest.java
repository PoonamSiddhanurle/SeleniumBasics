package chromeOptionsClassStudy;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SampleTest {

	public static void main(String[] args) throws InterruptedException {
	ChromeOptions opt=new ChromeOptions();	
	ArrayList<String>al=new ArrayList<>();
	//al.add("incognito");
	al.add("start-maximized");
	//al.add("headless");
	al.add("--disable-popup-blocking");
	al.add("--disable-extensions");
	al.add("--disable-notifications");
	  opt.addArguments(al);
	Thread.sleep(2000);	
	WebDriver driver=new ChromeDriver(opt);
	driver.get("https://www.ajio.com/");

	}

}
