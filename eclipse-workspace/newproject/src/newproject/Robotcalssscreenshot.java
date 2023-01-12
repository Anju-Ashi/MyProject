package newproject;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robotcalssscreenshot {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\Downloads\\chromedriver_win32 (14)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        WebElement search=driver.findElement(By.name("q"));
        search.sendKeys("robot class in selenium");
        search.sendKeys(Keys.ENTER);
        Robot robot=new Robot();robot.mouseWheel(7); 
        

	}

}
