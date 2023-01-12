package com.testnglistener;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

 
public class Testclass {
	@Test
	public void testcsr1()
	{
		Assert.assertTrue(true);
	}
	
	@Test
	public void testcsr2()
	{
		Assert.assertTrue(false);

}
	@Test(dependsOnMethods="testcsr2")
	public void testcsr3()
	{
		Assert.assertTrue(true);
	}
}