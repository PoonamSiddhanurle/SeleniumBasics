package pomPolicyUsingTestNG;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import baseClass.Base;
import utilityClass.Utility;

public class Listener extends Base implements ITestListener
{
	@Override
	public void onTestFailure(ITestResult result) 
	{
		try {
			Utility.takeScreenshot(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
  @Override
   public void onTestSuccess(ITestResult result) 
   {
	Reporter.log("Tc"+result.getName()+ "is running successfully", true);
   }
  @Override
  public void onTestSkipped(ITestResult result) 
  {
	Reporter.log("TC"+result.getName()+ " skipped", true);
  }
}
