package testNG_pack;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersClass implements ISuiteListener, ITestListener{
	
	
	@Override
	public void onStart(ISuite suite)
	{
		System.out.println(" onstart method of ISuiteListener");
	}
	
	@Override
	public void onFinish(ISuite suite)
	{
		System.out.println(" onfinish method of ISuiteListener");
	}
	
	@Override
	 public void onStart(ITestContext context)
	{
		System.out.println("ITestListener -ON START ");   
	}
	
	@Override
	 public void onFinish(ITestContext context) 
	{
		System.out.println(" ITestListener- ON FINISH");  
	}
	
	public void onTestStart(ITestResult result) 
	{
		System.out.println("Execution started for : "+result.getMethod().getMethodName());
	}
	
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Passed: "+result.getMethod().getMethodName());
	}
	
	public void onTestFailure(ITestResult res)
	{
		System.out.println(" failed: "+res.getMethod().getMethodName());
		System.out.println("Error/exception : "+res.getThrowable().getLocalizedMessage());
	
	}
	
		
	public void onTestSkipped(ITestResult result)
	{
		System.out.println(" Skipped: "+result.getMethod().getMethodName());
	}
	
	
	
	
}
	
