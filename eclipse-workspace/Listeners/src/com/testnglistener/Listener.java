package com.testnglistener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {
	
 public void  onTestStart(ITestResult result)  {
	System.out.println("Test method " + result.getName() +"Starts");
 }

public void onTestSuccess(ITestResult result)  {
	System.out.println("Test method " + result.getName() +"Success" );
	}
	
public void onTestFailure(ITestResult result)  {
	System.out.println("Test method " +result.getName() +"Fails");
	}
public void onTestSkipped(ITestResult result)  {
	System.out.println("Test method " +result.getName() +"skipped");
	}
public void onStart(ITestResult result)  {
	System.out.println("Test method " +result.getName() +"onstart");
	}
public void onFinish(ITestResult result)  {
	System.out.println("Test method " +result.getName() +"onfinish");
	}
	
public void onTestSuccess(ITestContext context)  {
	System.out.println("Test method " +context.getName() +"Ends" );
	}
}

