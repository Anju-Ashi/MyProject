package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\Desktop\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		String text = driver.findElement(By.xpath("//b[normalize-space()='Jul 6, 2017']")).getText();
		System.out.println(text);
	}

}
