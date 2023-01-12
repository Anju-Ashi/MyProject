package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\Downloads\\chromedriver_win32 (14)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        
        driver.manage().window().maximize();
        driver.findElement(By.id("userName")).clear();
        driver.findElement(By.id("userName")).sendKeys("Anjana");
        
        driver.findElement(By.id("userEmail")).sendKeys("anjana@gmail.com");
        driver.findElement(By.id("currentAddress")).sendKeys("ABC , XXX , Trivandrum");
        driver.findElement(By.id("permanentAddress")).sendKeys("ABC , XXX , Trivandrum");
        driver.findElement(By.id("submit")).submit();
        driver.quit();
        
        

	}

}
