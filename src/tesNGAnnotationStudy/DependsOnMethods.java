package tesNGAnnotationStudy;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethods {
	@Test(dependsOnMethods = "enterUN", priority=-8,invocationCount = 4, timeOut=1000)
	public void login()
	{
		Reporter.log("login succesful...", true);
	}
	@Test
	public void enterUN()
	{
		//Assert.fail();
		Reporter.log("Username", true);
	}
	@Test 
	public void enterPwd()
	{
		
		Reporter.log("Password", true);
	}
}