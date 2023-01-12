package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditionalcommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\Desktop\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.xpath("//input[@name='userName']"));
		if(email.isDisplayed()&&email.isEnabled())
		{
			email.sendKeys("mercury");
		}
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		if(password.isEnabled()&&password.isDisplayed())
		{
			password.sendKeys("mercury123");
		
		}
		driver.close();
	}

}
