import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class mousemoverobot {
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
	public void mousemove() throws AWTException, InterruptedException {
		Robot robot=new Robot();
		robot.mouseMove(600, 600);
		Thread.sleep(2000);
	}
	@Test
	public void mousePress() throws AWTException, InterruptedException {
		
		Robot robot=new Robot();
			robot.mousePress(InputEvent.BUTTON2_DOWN_MASK);
			Thread.sleep(2000);
			robot.mouseRelease(InputEvent.BUTTON2_DOWN_MASK);
			Thread.sleep(2000);
	}
	@Test
	public void keyPress() throws AWTException, InterruptedException {
		Robot robot=new Robot();
		 robot.keyPress(KeyEvent.VK_H);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_E);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_L);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_L);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_O);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_SPACE);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_F);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_R);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_O);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_M);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_SPACE);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_G);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_E);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_E);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_K);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_S);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_F);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_O);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_R);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_G);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_E);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_E);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_K);
	        Thread.sleep(500);
	        robot.keyPress(KeyEvent.VK_S);
	}
	@AfterTest
	public void closebrowser() {

		  driver.quit();
	}
}
