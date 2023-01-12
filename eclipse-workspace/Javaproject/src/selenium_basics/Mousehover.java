package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\Desktop\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
	
		Actions actions = new Actions(driver);		
		WebElement company = driver.findElement(By.xpath("//a[@class='link'][normalize-space()='Company']"));
		WebElement about = driver.findElement(By.xpath("//div[@class='col-md-12 col-lg-12 resources']//a[normalize-space()='About Us']"));
		WebElement executive = driver.findElement(By.xpath("//a[@href='company/about-us/executive-profiles/']"));
		//WebElement talktous = driver.findElement(By.xpath("//a[@title='Talk to us']"));
		//WebElement Checkyourrefund = driver.findElement(By.linkText("Check Your Refund"));
		actions.moveToElement(company).build().perform();
		actions.moveToElement(about).build().perform();
		actions.moveToElement(executive).click().build().perform();
		Thread.sleep(3000);
		driver.close();
		
}
}	
						