package selenium_basics;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Download {

	public static void main(String[] args) throws InterruptedException {
		
		  
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\Desktop\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/FileDownload.html");
		/*driver.findElement(By.xpath("//textarea[@id='textbox']")).sendKeys("testing");
		driver.findElement(By.xpath("//button[@id='createTxt']")).click();
		driver.findElement(By.xpath("//a[@id='link-to-download']")).click();
		Thread.sleep(3000);*/

		
		
		driver.findElement(By.xpath("//textarea[@id='pdfbox']")).sendKeys("testing");
		driver.findElement(By.xpath("//button[@id='createPdf']")).click();
		driver.findElement(By.xpath("//a[@id='pdf-link-to-download']")).click();
		Thread.sleep(3000);
		
		

	}

}
