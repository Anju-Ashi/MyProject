package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\Downloads\\chromedriver_win32 (14)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://output.jsbin.com/osebed/2");
        
        driver.manage().window().maximize();
        Select select=new Select(driver.findElement(By.id("fruits")));
        select.selectByVisibleText("Banana");
        select.selectByVisibleText("Orange");
        select.selectByVisibleText("Grape");
        Thread.sleep(2000);
        select.deselectAll();
        Boolean ele=select.isMultiple();
        System.out.println(ele);
        select.selectByVisibleText("Apple");

	}

}
