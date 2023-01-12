package newproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\Downloads\\chromedriver_win32 (14)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        //navigate to facebook
        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(2000);
        //navigate back
        driver.navigate().back();
        Thread.sleep(2000);
        //navigate forward
        driver.navigate().forward();
        Thread.sleep(2000);
        //refresh
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.quit();
        

	}

}
