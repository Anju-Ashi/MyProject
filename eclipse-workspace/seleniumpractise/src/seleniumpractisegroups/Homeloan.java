package seleniumpractisegroups;

import org.testng.annotations.Test;

public class Homeloan {
	@Test  
	public void WebLoginHomeLoan()  
	{  
	  System.out.println("Web Login Home Loan");  
	}  
	@Test(groups= {"SmokeTest"})  
	public void MobileLoginHomeLoan()  
	{  
	  System.out.println("Mobile Login Home Loan");  
	}  
	@Test  
	public void APILoginHomeLoan()  
	{  
	  System.out.println("API Login Home Loan");  
	}  
}
