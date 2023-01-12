package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\Downloads\\chromedriver_win32 (14)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        WebElement search=driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
        search.sendKeys("Software Testing");
        search.sendKeys(Keys.ENTER);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(0,2000)");
        Thread.sleep(2000);
        WebElement element=driver.findElement(By.xpath("//*[@id=\"rso\"]/div[8]/div/div/div[1]/div/a/div/cite"));
        element.click();
        js.executeScript("arguments[0].scrollIntoView();", element);
        Thread.sleep(2000);
        driver.quit();
	}

}
