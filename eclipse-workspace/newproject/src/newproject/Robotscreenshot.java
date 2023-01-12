package newproject;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robotscreenshot {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		String driverPath = "C:\\Users\\Anjana\\Downloads\\chromedriver_win32 (14)\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		WebDriver driver = new ChromeDriver();
		String url=("https://www.google.com/");
		driver.get(url);
		
		WebElement search=driver.findElement(By.name("q"));
	      search.sendKeys("robot class in selenium");
	      search.sendKeys(Keys.ENTER);
	      Robot robot = new Robot();
		  Rectangle rect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		  File path = new File("C:\\Users\\Anjana\\Desktop\\screenshot");
		  
		  BufferedImage img = robot.createScreenCapture(rect);
		  ImageIO.write(img, "JPG", path);
		  Thread.sleep(2000);

	}

}
