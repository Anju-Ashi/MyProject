package com.mystore.utility;

import org.testng.reporters.TestHTMLReporter;
import org.testng.reporters.XMLReporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.observer.ExtentObserver;



public class Extendmanager {
	public static ExtentObserver[] htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;
	
	public static void setExtent() {
		
		// htmlReporter = new TestHTMLReporter();
		//htmlReporter.length;
		
		
		extent = new ExtentReports();
		//extent.attachReporter(htmlReporter);
		
		extent.setSystemInfo("HostName", "MyHost");
		extent.setSystemInfo("ProjectName", "KichizoiProject");
		extent.setSystemInfo("Tester", "Hitendra");
		extent.setSystemInfo("OS", "Win10");
		extent.setSystemInfo("Browser", "Chrome");
	}
	public static void endReport() {
		extent.flush();
	}
}
