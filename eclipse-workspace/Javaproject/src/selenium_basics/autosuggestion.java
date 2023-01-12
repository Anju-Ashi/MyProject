package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\Desktop\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yatra.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement from = driver.findElement(By.id("BE_flight_origin_city"));
		from.click();
		Thread.sleep(2000);
		from.sendKeys("sydney");
		Thread.sleep(2000);
		from.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		from.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.close();
		
		
		

	}

}
