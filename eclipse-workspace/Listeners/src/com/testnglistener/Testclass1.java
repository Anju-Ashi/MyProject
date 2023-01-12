package com.testnglistener;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testclass1 {
	@Test
	public void testcsr4()
	{
		Assert.assertTrue(true);
	}
	
	@Test
	public void testcsr5()
	{
		Assert.assertTrue(false);

}
	@Test(dependsOnMethods="testcsr5")
	public void testcsr6()
	{
		Assert.assertTrue(true);
	}
}
