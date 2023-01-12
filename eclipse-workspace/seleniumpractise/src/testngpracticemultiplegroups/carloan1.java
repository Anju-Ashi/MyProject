package testngpracticemultiplegroups;

import org.testng.annotations.Test;

public class carloan1 {
	@Test(groups= {"SmokeTest"})  
	 public void WebLoginPersonalLoan()  
	 {  
	     System.out.println("Web Login Personal Loan");  
	 }  
	 @Test  (groups= {"SmokeTest",})
	 public void MobileLoginPersonalLoan()  
	 {  
	     System.out.println("Mobile Login Personal Loan");  
	 }  
	 @Test (groups="SanityTest")
	 public void APILoginPersonalLoan()  
	 {  
	     System.out.println("API Login Personal Loan");  
	 }  
}
