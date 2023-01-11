package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mystore.base.Baseclass;
import com.mystore.pageobjects.Checkoutpage;
import com.mystore.pageobjects.Indeexpage;
import com.mystore.pageobjects.Loginpage;
import com.mystore.pageobjects.Shoppingpage;
import com.mystore.utility.Log;

public class Shoppingtest extends Baseclass {
 Indeexpage indexpage;
 Shoppingpage shoppingpage;
 Checkoutpage checkoutpage; 
 @Parameters("browser")
@BeforeMethod
public void setup(String browser) {
	launchbrowser(browser);
}

@AfterMethod
public void teardown() {
	getDriver().quit();
}
@Test(priority=1)
public void shopnow() throws Throwable  {
	Log.startTestCase("Shopnowtest");
	indexpage=new Indeexpage();
	shoppingpage= indexpage.shopnowclick();
	shoppingpage.filterbyprice();
   
	shoppingpage.filterbybrand();
	shoppingpage.filterbybrand1();
	shoppingpage.addtocart1();
	shoppingpage.cartlist();
    checkoutpage=new Checkoutpage();
	checkoutpage=shoppingpage.checkout();
	Log.endTestCase("Shopnowtest");
}

	/* boolean result=checkoutpage.ischeckoutdisplayed();
	Assert.assertTrue(result);
	Log.endTestCase("Shopnowtest");
	*/
}


