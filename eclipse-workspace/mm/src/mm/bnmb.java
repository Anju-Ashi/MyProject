package mm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class bnmb {
	WebDriver driver;

        @Test
		public void dd()
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\Desktop\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yatra.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement from = driver.findElement(By.id("BE_flight_origin_city"));
		from.click();

	}

}
