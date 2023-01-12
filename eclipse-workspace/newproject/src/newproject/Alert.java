

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\Downloads\\chromedriver_win32 (14)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/delete_customer.php");
      
       
        WebElement element=driver.findElement(By.name("cusid"));
        element.sendKeys("ascvf");
        WebElement element1=driver.findElement(By.name("cusid"));
        element1.submit();
        
        driver.switchTo().alert();
        //driver.switchTo().alert().accept();
       
        driver.switchTo().alert().dismiss();
        Thread.sleep(2000);
        driver.quit();
        
        
        
	}

}
