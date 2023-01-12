package selenium_basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linksonpages {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\Desktop\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://developer.salesforce.com/signup");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		/*List<WebElement> tag =  driver.findElements(By.tagName("a"));
		for(int i=0;i<tag.size();i++)
		{
			System.out.println("the links are:"+tag.get(i).getAttribute("href"));
		}*/
		
		List<WebElement> tag =  driver.findElements(By.tagName("div"));
		for(int i=0;i<tag.size();i++)
		{
			System.out.println("the links are:"+tag.get(i).getAttribute("value"));
			System.out.println("the links are:"+tag.get(i).getText());
		}
	}

}
