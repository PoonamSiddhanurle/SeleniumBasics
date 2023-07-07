package seleniumStudy1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class My1stSeleniumProgram {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569891%7Cb%7Cfb%20sign%20up%7C&placement=&creative=589460569891&keyword=fb%20sign%20up&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221832%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-294779041346%26loc_physical_ms%3D9299207%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwl6OiBhA2EiwAuUwWZRkGcUz3PnImN5e-GVLDLNDxuHiFqM-fc14ybKTYYg0gQMOmghNZrhoCu1QQAvD_BwE");
		//driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand_Login_Register&gclid=CjwKCAjwov6hBhBsEiwAvrvN6NM-_oxycNv0hY867RBU5J4GfzptQJbdray-3ZQcc7oqR_mOq4yGdxoCl_IQAvD_BwE&gclsrc=aw.ds");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Poonam");
		
		

	}

}
