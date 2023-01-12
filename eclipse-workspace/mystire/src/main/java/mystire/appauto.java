package mystire;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class appauto {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\Desktop\\drivers\\chromedriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	WebElement from = driver.findElement(By.name("email"));
	from.clear();
	from.sendKeys("anjanaraj00@gmail.com");
	Thread.sleep(1000);
	WebElement pass = driver.findElement(By.name("pass"));
	pass.sendKeys("vaibhavi2019vaibhavi14");
	WebElement login = driver.findElement(By.name("login"));
	login.click();
	WebElement image = driver.findElement(By.tagName("image"));
	image.click();
	
	
}
}