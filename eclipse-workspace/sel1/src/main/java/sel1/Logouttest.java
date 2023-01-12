package sel1;

import org.testng.annotations.Test;

public class Logouttest {

	@Test(priority=2, groups="Regression")
	public void logintest()
	{
		System.out.println("lofin test succesful");
	}
	@Test(priority=1)
	public void Searching()
	{
		System.out.println("Searching succesful");
	}

		
	}

