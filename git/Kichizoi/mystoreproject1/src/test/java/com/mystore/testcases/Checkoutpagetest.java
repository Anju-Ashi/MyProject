package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mystore.base.Baseclass;
import com.mystore.pageobjects.Checkoutpage;
import com.mystore.pageobjects.Indeexpage;
import com.mystore.pageobjects.Loginpage;
import com.mystore.pageobjects.Shoppingpage;


public class Checkoutpagetest extends Baseclass {
	 Indeexpage indexpage;
	 Shoppingpage shoppingpage;
	 Checkoutpage checkoutpage; 
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
	@Test(groups="Regression")
	public void shopnow() throws InterruptedException {
		indexpage=new Indeexpage();
		login1= indexpage.joinnow();
		login1.loginpg();
		shoppingpage= indexpage.shopnowclick();
		shoppingpage.filterbyprice();
	   
		shoppingpage.filterbybrand();
		shoppingpage.filterbybrand1();
		shoppingpage.addtocart1();
		shoppingpage.cartlist();
	    checkoutpage=new Checkoutpage();
		checkoutpage=shoppingpage.checkout();
		Double finalprice=checkoutpage.getprice();
		Double finaltotalprice=checkoutpage.totalprice();
		Double totalexpectedprice=finalprice*3;
		Thread.sleep(6000);
		Assert.assertNotEquals(finaltotalprice,totalexpectedprice);
		
		
}
}