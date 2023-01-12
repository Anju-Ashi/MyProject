package run;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Run {
	WebDriver driver;

	 
	public  void LaunchingTestTest1() {
	   
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\Desktop\\drivers\\chromedriver\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
		
	 driver.manage().window().maximize();
	 driver.get("https://opensource-demo.orangehrmlive.com/");
	  }
	 
	public  void LaunchingTestTest2() {
	   
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\Desktop\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/what-is-the-order-of-execution-of-tests-in-testng");
	  }

}
