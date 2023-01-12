package newproject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robotkeypress {

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\Downloads\\chromedriver_win32 (14)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
      
       
        WebElement element=driver.findElement(By.name("q"));
        Robot robot=new Robot();
        element.sendKeys("");
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_H);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_E);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_L);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_L);
        Thread.sleep(2000);
        	robot.keyPress(KeyEvent.VK_O);			

        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        Thread.sleep(2000);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(2000);
        
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_TAB);
        Thread.sleep(2000);
        robot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(2000);
        
        
        
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(2000);
        robot.keyRelease(KeyEvent.VK_DOWN);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_UP);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_UP);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_UP);
        Thread.sleep(2000);
        robot.keyRelease(KeyEvent.VK_DOWN);
        Thread.sleep(2000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // press left click
        Thread.sleep(2000);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // press left click
        Thread.sleep(2000);
        robot.mouseMove(630, 400);
        Thread.sleep(2000);
        robot.mousePress(InputEvent.BUTTON3_DOWN_MASK); // press left click
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_DOWN);
        Thread.sleep(2000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // press left click
        Thread.sleep(2000);
        robot.keyRelease(KeyEvent.VK_DOWN);
        Thread.sleep(2000);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // press left click
        Thread.sleep(2000);
        robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK); // press left click
        Thread.sleep(2000);
        



        



	}

}
