package param;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Crossbrowseryesting {
	WebDriver driver;
	
	@Parameters("browser")
	@Test
	public void crossbrotest(String browser) {
		if (browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\Desktop\\drivers\\chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		
	}
		else if(browser.equalsIgnoreCase("Firefox"))
		
	{

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Anjana\\Desktop\\drivers\\geckodriver\\geckodriver.exe");
	 driver = new FirefoxDriver();
	
	}
	
		else if(browser.equalsIgnoreCase("Edge"))
		
	{

		System.setProperty("webdriver.edge.driver", "C:\\Users\\Anjana\\Desktop\\drivers\\edge\\msedgedriver.exe");
	 driver = new EdgeDriver();
	
	}
   driver.get("https://www.salesforce.com/au/");
   driver.manage().window().maximize();	
		
	}

}
