package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class slider {

	public static void main(String[] args) throws InterruptedException {
		
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\Desktop\\drivers\\chromedriver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://jqueryui.com/resizable/");
				driver.manage().window().maximize();			    
				driver.switchTo().frame(0);

				Actions actions = new Actions(driver);	
				WebElement resize = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-e']"));
				actions.moveToElement(resize).dragAndDropBy(resize, 50, 50).build().perform();
				Thread.sleep(3000);
	}

}
