package chromeOptionsClassStudy;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsUse {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		ArrayList<String>al= new ArrayList<>();
		al.add("start-maximized");
		al.add("incognito");
		al.add("--disable-notifications");
		//al.add("disable-infobars");
		//al.add("disable-extensions");
		//al.add("version");
		opt.addArguments(al);
		Thread.sleep(2000);
		//opt.addArguments("headless");
		//
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.ajio.com/");
		Thread.sleep(2000);
	}

}
