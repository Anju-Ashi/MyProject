package newproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Datepicker {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\Downloads\\chromedriver_win32 (14)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flydubai.com/en/");
        
        driver.manage().window().maximize();
        
        WebElement from=driver.findElement(By.name("airport-origin"));
        from.click();
        from.sendKeys("Kochi");
        driver.findElement(By.className("airCity")).click();
        
        WebElement to=driver.findElement(By.name("airport-destination"));
        to.click();
        to.sendKeys("Dubai");
        WebElement select=driver.findElement(By.xpath(" //div[@class='mat-form-group makeBookingTo airportPickerTo source-to-des-grid mb-xl-0 mb-lg-0 mb-md-0 mb-sm-3 mb-3 mr-grid-space input-valid']//li[1]//a[1]"));
        
        Actions actions = new Actions(driver);
        actions.sendKeys(select, Keys.RETURN).perform();

       List<WebElement>days =driver.findElements(By.xpath("//div[@class='lightpick__day is-disabled is-strike']"));
        
       
        for (WebElement day: days) {
        	
        	System.out.println(day.getText());
        	if (day.getText().equals("15"))
        		Thread.sleep(2000);{
        		day.click();

        	
        }
        
        
     
        driver.quit();
        	
        	
        

        }	}
}
  		
	
   
	


