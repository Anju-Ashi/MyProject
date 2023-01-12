package sel1;

import org.testng.annotations.Test;
@Test(groups="registration")
public class logintest { 

	 

	

	@Test( priority=2, groups="Regression")
	public void logintest()
	{
		System.out.println("lofin test succesful");
	}
	@Test(priority=3)
	public void Searching()
	{
		System.out.println("Searching succesful");
	}
	@Test(priority=1,groups={"Regression","Smoke"})
	public void Typing()
	{
		System.out.println("Typing test succesful");
	}
	
	@Test(priority=4)
	public void logouttest()
	{
		System.out.println("logout test succesful");
	}
	 
		

}
