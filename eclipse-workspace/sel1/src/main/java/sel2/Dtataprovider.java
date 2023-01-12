package sel2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Dtataprovider {
	WebDriver driver;

	  @Test()
	  @BeforeClass
	  public  void LaunchingTestTest() {
	   
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\Desktop\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
}


@Test()
public void launchtestTest() {

driver.get("https://opensource-demo.orangehrmlive.com/");
}

@Parameters({"username","password"})
@Test()
public void logintestTest(String uname, String psswd) {



	driver.findElement(By.id("txtUsername")).sendKeys("uname");
	driver.findElement(By.id("txtPassword")).sendKeys("psswd");
	driver.findElement(By.className("button")).click();
}
@Test()
@AfterClass
public void teardown() {
	    
	    driver.close();
	  }
}



