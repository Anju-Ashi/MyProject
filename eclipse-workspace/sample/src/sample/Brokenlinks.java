package sample;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinks {
	public static void main(String[] args) throws InterruptedException, IOException {
		  
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\Desktop\\drivers\\chromedriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
    
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://demo.guru99.com/test/newtours/");
	Thread.sleep(5000);
	List<WebElement> links = driver.findElements(By.tagName("a"));
	System.out.println(links.size());
	for(int i=0;i<=links.size();i++)
	{
		WebElement element= links.get(i);
		
		String url=element.getAttribute("href");
		
		URL link = new URL(url);
		HttpURLConnection httpcon=(HttpURLConnection) link.openConnection();
		Thread.sleep(2000);
		httpcon.connect();
		int rescode=httpcon.getResponseCode();
		if(rescode>400)
		{
			System.out.println(url + " " +"broken link");
		}
			else
			{
				System.out.println(url + " " +"valid lnk");	
			}
		
				
			
		}
		
	}
}
