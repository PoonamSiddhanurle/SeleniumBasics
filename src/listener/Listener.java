package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener 
{
 @Override
    public void onTestSuccess(ITestResult result) 
 {
	 String TCName = result.getName();
	Reporter.log("This method "+TCName+ "is running successfully", true);
}
 @Override
	public void onTestFailure(ITestResult result) 
 {  
	 Reporter.log("This method "+result.getName()+ "is Failed", true);	
	}
 @Override
	public void onTestStart(ITestResult result) 
 {
	 Reporter.log("This method "+result.getName()+ "execution is started", true);
	}
 @Override
	public void onTestSkipped(ITestResult result) 
 {   
	 Reporter.log("This TC "+result.getName()+ "is skipped please check dependent method", true);	
	}
}
