import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Zoomin1 {
	public String url=("https://demo.guru99.com/test/newtours/");
	String driverPath = "C:\\Users\\Anjana\\Desktop\\drivers\\chromedriver\\chromedriver.exe";
	public WebDriver driver ;

    @BeforeTest
   void launchbrowser() {
			System.setProperty("webdriver.chrome.driver", driverPath);
			driver = new ChromeDriver();
			driver.get(url);
			  }
    @Test
    public void zoom() throws AWTException, InterruptedException {
    	 
   
    	
    	for(int i=0;i<6;i++)
    	{
    		Robot robot=new Robot();
    		robot.keyPress(KeyEvent.VK_CONTROL);
    		robot.keyPress(KeyEvent.VK_ADD);
    		robot.keyRelease(KeyEvent.VK_ADD);
    		robot.keyRelease(KeyEvent.VK_CONTROL);
    		Thread.sleep(2000);
    		
    	}
    	System.out.println("About to zoom in");
    	for(int i=0;i<6;i++)
    	{
    		Robot robot=new Robot();
    		robot.keyPress(KeyEvent.VK_CONTROL);
    		robot.keyPress(KeyEvent.VK_SUBTRACT);
    		robot.keyRelease(KeyEvent.VK_SUBTRACT);
    		robot.keyRelease(KeyEvent.VK_CONTROL);
    		Thread.sleep(2000);
    		
    	}
    	System.out.println("About to zoom out");
    	
}
    @AfterTest
public void closebrowser() {

	  driver.quit();
}
}
