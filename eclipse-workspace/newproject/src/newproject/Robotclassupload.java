package newproject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robotclassupload {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\Downloads\\chromedriver_win32 (14)\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	      driver.get("http://my.monsterindia.com/create_account.html");
	      // scroll to reach upload button
	      JavascriptExecutor j = (JavascriptExecutor)driver;
	      j.executeScript("scroll(0,500)");
	      // file path passed as parameter to StringSelection
	      
	     
	      // Clipboard cop
	      StringSelection str = new StringSelection("C:\\Users\\Anjana\\Desktop\\resume\\anjana_raj_Test_Engineer_resume.pdf");
	      Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	   
	      //identify element and click
	      driver.findElement(By.xpath("//*[@id=\"registerThemeDefault\"]/div/div[4]/div/div/div/form/div[1]/div[2]/div/div/div[1]/div/label/i")).click();
	      
	      // Robot object creation
	      Robot r = new Robot();
	      //pressing enter
	      r.keyPress(KeyEvent.VK_ENTER);
	      Thread.sleep(2000);
	      //releasing enter
	      r.keyRelease(KeyEvent.VK_ENTER);
	      Thread.sleep(2000);
	      
	      
	      r.keyPress(KeyEvent.VK_CONTROL);
	      r.keyPress(KeyEvent.VK_V);
	      Thread.sleep(2000);
	      //releasing ctrl+v
	      r.keyRelease(KeyEvent.VK_CONTROL);
	      r.keyRelease(KeyEvent.VK_V);
	      Thread.sleep(2000);
	      r.keyPress(KeyEvent.VK_ENTER);
	      Thread.sleep(2000);
	      //releasing enter
	      r.keyRelease(KeyEvent.VK_ENTER);
	      Thread.sleep(2000);
	      r.keyPress(KeyEvent.VK_CONTROL);
	      r.keyPress(KeyEvent.VK_V);
	      Thread.sleep(2000);
	      //releasing ctrl+v
	      r.keyRelease(KeyEvent.VK_CONTROL);
	      r.keyRelease(KeyEvent.VK_V);
	      
	      Thread.sleep(2000);
	      //pressing enter
	      r.keyPress(KeyEvent.VK_ENTER);
	      Thread.sleep(2000);
	      //releasing enter
	      r.keyRelease(KeyEvent.VK_ENTER);
	      Thread.sleep(2000);
	}

}
