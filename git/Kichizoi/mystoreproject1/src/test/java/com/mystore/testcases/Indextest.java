package com.mystore.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mystore.base.Baseclass;
import com.mystore.pageobjects.Indeexpage;
import com.mystore.pageobjects.Shoppingpage;
import com.mystore.utility.Log;

public class Indextest extends Baseclass {
  Indeexpage indexpage;
  Shoppingpage shoppingpage;
  
    @Parameters("browser")
	@BeforeMethod(groups= {"Smoke","Sanity","Regression"})
	public void setup(String browser) {
		launchbrowser(browser);
	}
	
	@AfterMethod(groups= {"Smoke","Sanity","Regression"})
	public void teardown() {
		getDriver().quit();
	}
	
	@Test(groups="Smoke")
	public void verifylogo() {
		Log.startTestCase("verifyLogo");
		indexpage=new Indeexpage();
		boolean logo=indexpage.logopresent();
	     Assert.assertTrue(logo);
	     Log.endTestCase("verifyLogo");
	}
	
	@Test(groups="Smoke")
	public void verifytilte() {
		Log.startTestCase("verifytitle");
		indexpage=new Indeexpage();
		String actual=indexpage.gettitle(getDriver());
	    
	     Assert.assertEquals(actual,"Home - Kichizoi");
	     Log.endTestCase("verifytitle");
		}
	@Test(priority=3)
	public void joinclick() {
		
		indexpage=new Indeexpage();
		indexpage.joinnow();
	}
	@Test(priority=4)
	public void shopnow() throws InterruptedException {
		Log.startTestCase("Shopnowtest");
		indexpage=new Indeexpage();
		shoppingpage=indexpage.shopnowclick();
		Log.endTestCase("Shopnowtest");
	}
}