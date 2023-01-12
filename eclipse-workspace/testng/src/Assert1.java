import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Assert1 {
  @Test(priority=1)
  public void assertEquals() {
	  Assert.assertEquals("assertion1","assertion1");
	  System.out.println("This statement will execute");
	  Assert.assertEquals("assertion1", "assertion2");
	  System.out.println("This statement will not execute");
  }
  @Test(priority=2)
  public void assertNotEquals() {
	  Assert.assertNotEquals("assertion1","assertion2");
	  System.out.println("This statement will execute");
	  Assert.assertNotEquals("assertion1", "assertion1");
	  System.out.println("This statement will not execute");
  
  }

	 @Test(priority=3)
	    public void assertTrue(){
	        Assert.assertTrue(3<5);
	        System.out.println("This line will be executed as assertTrue will"
	                + " pass because the 3<5(which will return true)");
	    }
	 @Test(priority=4)
	    public void assertFalse(){
	        Assert.assertFalse(3>5);
	        System.out.println("This line is executed because assertFalse"
	                + "assertion passes as the given condition will return false");
	    }
	 @Test(priority=5)
	    public void assertNull(){
	        Assert.assertNull(null);
	        System.out.println("Since we we set null in the condition, the assertion "
	                + "assertNull will pass");
	    }	
	 @Test(priority=6)
	    public void assertNotNull(){
	        Assert.assertNotNull("This assertion will pass because this "
	                + "string don't returns a null value");
	        System.out.println("This line is executed because assertNotNull have have passed");
	    }
	 @Test(priority=7)
	 public void SoftassertNull(){
		 SoftAssert softassert=new SoftAssert();
		 softassert.assertNull("null");
		 System.out.println("this softassert statemnet will execute");
		 softassert.assertNull("assert1");
		 System.out.println("this softassert statemnet will not execute");
		 softassert.assertAll();
		 
	 }
	 
  }

