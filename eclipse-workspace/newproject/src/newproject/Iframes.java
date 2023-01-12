package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\Downloads\\chromedriver_win32 (14)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.quest-global.com/");
        WebElement element=driver.findElement(By.xpath("//*[@id=\"engineering-new-slider\"]/div/div[1]/div/div/div[1]/a/span[2]/img"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", element);
        Thread.sleep(2000);
        element.click();
        driver.switchTo().frame("innerBannerVideo");
        
        WebElement play=driver.findElement(By.className("ytp-cued-thumbnail-overlay"));
        play.click();
        
        Thread.sleep(2000);

	}

}
