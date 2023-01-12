package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Promptalert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\Downloads\\chromedriver_win32 (14)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialsteacher.com/codeeditor?cid=js-3");
      
       
//        WebElement element=driver.findElement(By.id("btnRun"));
//       
//        element.click();
       Thread.sleep(2000);
       
        
        driver.switchTo().alert().sendKeys("1212");
        
        Thread.sleep(2000);
       
        driver.switchTo().alert().accept();
        

	}

}
