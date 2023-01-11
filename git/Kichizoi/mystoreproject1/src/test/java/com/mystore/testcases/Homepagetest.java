package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mystore.base.Baseclass;
import com.mystore.pageobjects.Homepage;
//import com.mystore.pageobjects.Searchproduct;

public class Homepagetest extends Baseclass {
	Homepage homepage;
	
	@Parameters("browser")
	@BeforeMethod
	public void setup(String browser) {
		launchbrowser(browser);
	}
	
	@AfterMethod
	public void teardown() {
		getDriver().quit();
	}
	@Test
	public void searchproduct() throws InterruptedException {
		 homepage=new Homepage();
		homepage.searchproduct();
		
		boolean result=homepage.verifysearchedproduct();
		Assert.assertTrue(result);
		homepage.addtocart();
		
     
	}
}
