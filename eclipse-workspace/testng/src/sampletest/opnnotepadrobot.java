package sampletest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class opnnotepadrobot {
	public String url=("https://www.google.com/");
	String driverPath = "C:\\\\Users\\\\Anjana\\\\Desktop\\\\drivers\\\\chromedriver\\\\chromedriver.exe";
	public WebDriver driver ;
	
	@BeforeTest
	   void launchbrowser() {
				System.setProperty("webdriver.chrome.driver", driverPath);
				driver = new ChromeDriver();
				driver.get(url);
				  }
  @Test
  public void opennotepad() throws InterruptedException, IOException, AWTException {
	  String command = "notepad.exe";
      Runtime run = Runtime.getRuntime();
      run.exec(command);
      try {
          Thread.sleep(2000);
      }
      catch (InterruptedException e)
      {
          // TODO Auto-generated catch block
          e.printStackTrace();
      }

      // Create an instance of Robot class
      Robot robot = new Robot();

      // Press keys using robot. A gap of
      // of 500 milli seconds is added after
      // every key press
      robot.keyPress(KeyEvent.VK_H);
      Thread.sleep(500);
      robot.keyPress(KeyEvent.VK_I);
      Thread.sleep(500);
      robot.keyPress(KeyEvent.VK_SPACE);
      Thread.sleep(500);
      robot.keyPress(KeyEvent.VK_I);
      Thread.sleep(500);
      robot.keyPress(KeyEvent.VK_SPACE);
      Thread.sleep(500);
      robot.keyPress(KeyEvent.VK_A);
      Thread.sleep(500);
      robot.keyPress(KeyEvent.VK_M);
      Thread.sleep(500);
      robot.keyPress(KeyEvent.VK_SPACE);
      Thread.sleep(500);
      robot.keyPress(KeyEvent.VK_A);
      Thread.sleep(500);
      robot.keyPress(KeyEvent.VK_N);
      Thread.sleep(500);
      robot.keyPress(KeyEvent.VK_J);
      Thread.sleep(500);
      robot.keyPress(KeyEvent.VK_A);
      Thread.sleep(500);
    
      robot.keyPress(KeyEvent.VK_N);
      Thread.sleep(500);
      robot.keyPress(KeyEvent.VK_A);
      Thread.sleep(500);
      
  }
  @AfterTest
	public void closebrowser() {

		  driver.quit();
	}
  }

