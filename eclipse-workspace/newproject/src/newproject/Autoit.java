package newproject;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Autoit {

	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\Downloads\\chromedriver_win32 (14)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       
        driver.get("https://demo.guru99.com/test/upload/");
        Thread.sleep(2000);
        
        WebElement element=driver.findElement(By.id("uploadfile_0"));
        Actions build = new Actions(driver);
        build.click(element).perform();
       
        Thread.sleep(5000);
        Runtime.getRuntime().exec("C:\\\\Users\\\\Anjana\\\\Desktop\\\\Autoit.exe");
        Thread.sleep(2000);
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("submitbutton")).submit();
        Thread.sleep(2000);
        driver.quit();
        
	}

}
