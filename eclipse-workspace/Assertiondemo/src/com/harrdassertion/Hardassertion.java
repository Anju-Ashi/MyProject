package com.harrdassertion;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Hardassertion {
	@Test
	public void testcsr1()
	{
		
		System.out.println("Test Starts");
		Assert.assertTrue(false);
		System.out.println("Test ends");
		Assert.assertTrue(true);
		
	}
	public void testcsr2()
	{
		
		System.out.println("Test2 Starts");
		Assert.assertTrue(true);
		System.out.println("Test2 ends");
		Assert.assertTrue(true);
		
	}
	
}
