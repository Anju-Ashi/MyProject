package failedtestcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ClassA {
	WebDriver driver;

	  @Test(retryAnalyzer=Retryanalsertest.class)
	
	  public  void LaunchingTestTest() {
	   
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\Desktop\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehmlive.com");
	  }
		public void verifytitletestTest() {
		    
			  
		    String title=driver.getTitle();
	  }
	  

	
	

		
	}

