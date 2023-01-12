package seleniumpractisegroups;

import org.testng.annotations.Test;

public class eduloan {
	@Test
	public void WebLogineduLoan()  
	{  
	System.out.println("Web Login Home Loan");  
	}  
	@Test  
	public void MobileLogineduLoan()  
	{  
	System.out.println("Mobile Login Home Loan");  
	}  
	@Test(groups= {"SmokeTest"})  
	public void APILogineduLoan()  
	{  
	System.out.println("API Login Home Loan");  
	}  
}
