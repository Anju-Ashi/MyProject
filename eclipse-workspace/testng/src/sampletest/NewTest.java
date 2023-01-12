package sampletest;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenersTestNG.class)
public class NewTest {
  @Test
  public void Test() {
	  System.out.println("Test strarts");
	 
  }
  @BeforeTest
  public void test1() {
	  System.out.println("Before test");
	  
  }
  @AfterTest
  public void test2() {
	  System.out.println("After test");
	  
}
  @BeforeSuite
  public void test3() {
	  System.out.println("Before Suite");
	 
}
  @AfterSuite
  public void test4() {
	  System.out.println("After Suite");
	
	  
  }
  @BeforeMethod
  public void test5() {
	  System.out.println("Before method");
	
  }
  @AfterMethod
  public void test6() {
	  System.out.println("After method");

  }
  @BeforeGroups
  public void test7() {
	  System.out.println("Before groups");
	 
  }
  @AfterGroups
  public void test8() {
	  System.out.println("After groups");
	  
  }
  @BeforeClass
  public void test9() {
	  System.out.println("Before class");
  }
  @AfterClass
  public void test10() {
	  System.out.println("After class");
	 ;
  }
}
	  
	  
	  
	  