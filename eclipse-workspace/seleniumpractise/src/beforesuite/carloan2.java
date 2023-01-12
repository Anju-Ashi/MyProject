package beforesuite;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class carloan2 {
	@Test(groups= {"SmokeTest"})  
	 public void WebLoginPersonalLoan()  
	 {  
	     System.out.println("Web Login Personal Loan");  
	 }  
	 @Test  
	 public void MobileLoginPersonalLoan()  
	 {  
	     System.out.println("Mobile Login Personal Loan");  
	 } 
	 @BeforeSuite
	 @Test  
	 public void APILoginPersonalLoan()  
	 {  
	     System.out.println("API Login Personal Loan");  
	 }  
}
