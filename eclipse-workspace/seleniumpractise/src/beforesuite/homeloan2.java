package beforesuite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class homeloan2 {
	@AfterSuite
	@Test(groups="SanityTest")  
	public void WebLoginHomeLoan()  
	{  
	  System.out.println("Web Login Home Loan");  
	}  
	@Test(groups= {"SmokeTest","SanityTest"})  
	public void MobileLoginHomeLoan()  
	{  
	  System.out.println("Mobile Login Home Loan");  
	}  
	@Test(groups={"SanityTest"})  
	public void APILoginHomeLoan()  
	{  
	  System.out.println("API Login Home Loan");  
	}  
}
