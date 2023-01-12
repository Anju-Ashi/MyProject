package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload {

	public static void main(String[] args) throws InterruptedException {
		 
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\Downloads\\chromedriver_win32 (14)\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://demo.guru99.com/test/upload/");
	        driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\Anjana\\Desktop\\java\\Div.java");
	        driver.findElement(By.id("terms")).click();
	        driver.findElement(By.id("submitbutton")).click();
	        Thread.sleep(2000);
	}

}
