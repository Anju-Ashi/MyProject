package selenium_basics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingwindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\Desktop\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/au/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//span[normalize-space()='Start my free trial']")).click();
		Thread.sleep(3000);
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> iterator=windows.iterator();
		String parentwindow= iterator.next();
		System.out.println(parentwindow);
		String childwindow=iterator.next();
		System.out.println(childwindow);
		
		driver.switchTo().window(childwindow);
		Thread.sleep(3000);
		driver.findElement(By.name("UserFirstName")).sendKeys("RCV");
		driver.findElement(By.name("UserLastName")).sendKeys("Acadamy");
		driver.switchTo().window(parentwindow);
		driver.close();
		
				
		
		
		
		

	}

}
