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
//import com.mystore.pageobjects.orderdetailspage;

public class Endtoendtest extends Baseclass {
	Indeexpage indexpage;
	 Shoppingpage shoppingpage;
	 Checkoutpage checkoutpage; 
	 Loginpage login1 ;
	 
	
	 @Parameters("browser")
	@BeforeMethod
	public void setup(String browser) {
		launchbrowser(browser);
	}

	@AfterMethod
	public void teardown() {
		getDriver().quit();
	}
	@Test()
	public void shopnow() throws InterruptedException {
		indexpage=new Indeexpage();
		
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
		login1= indexpage.joinnow();
		login1.loginpg();
		
		
}
}

