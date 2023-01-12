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
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class scrennshot {
	public String url=("https://www.google.com/");
	String driverPath = "C:\\Users\\Anjana\\Downloads\\chromedriver_win32 (14)\\chromedriver.exe";
	public WebDriver driver ;
	
@BeforeTest
  public void launchbrowser() {
	System.setProperty("webdriver.chrome.driver", driverPath);
	driver = new ChromeDriver();
	driver.get(url);
	  }
  @Test(priority=2)
  public void search() throws AWTException {
	  WebElement search=driver.findElement(By.name("q"));
      search.sendKeys("robot class in selenium");
      search.sendKeys(Keys.ENTER);
      Robot robot=new Robot();
      robot.mouseWheel(7); 
	  
  }

 
  
  @Test(priority=3)
  public void getscreenshot() throws IOException, AWTException, InterruptedException {
	  Robot robot = new Robot();
	  java.awt.Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
	  File path = new File("C:\\Users\\Anjana\\Desktop\\screenshot.png");
	  
	  BufferedImage img = robot.createScreenCapture(new Rectangle(size));
	  ImageIO.write(img, "JPG", path);
	  Thread.sleep(2000);
  }
  

@AfterTest
  public void closebrowser() {
	  driver.quit();
  }
}
