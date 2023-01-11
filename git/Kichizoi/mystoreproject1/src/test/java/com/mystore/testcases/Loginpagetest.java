package com.mystore.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mystore.base.Baseclass;
import com.mystore.pageobjects.Indeexpage;
import com.mystore.pageobjects.Loginpage;
import com.mystore.utility.Log;

public class Loginpagetest extends Baseclass {
	 Indeexpage indexpage;
	 Loginpage login1 ;
	 @Parameters("browser")
	@BeforeMethod(groups= {"Smoke","Sanity","Regression"})
	public void setup(String browser) {
		launchbrowser(browser);
	}
	
	@AfterMethod(groups= {"Smoke","Sanity","Regression"})
	public void teardown() {
		getDriver().quit();
	}
	@Test(groups={"Sanity","Smoke"})
	public void logintest() throws Throwable {
		Log.startTestCase("loginTest");
		indexpage=new Indeexpage();
		Log.info("user is going to click on SignIn");
		login1= indexpage.joinnow();
	    login1.loginpg();
		String actualURL=login1.getCurrURL();
	    String expectedURL="https://kichizoi.com/index.php/shop";
		Assert.assertNotEquals(actualURL, expectedURL);
		Log.info("Login is Sucess");
	    Log.endTestCase("loginTest");
		
	}
}
