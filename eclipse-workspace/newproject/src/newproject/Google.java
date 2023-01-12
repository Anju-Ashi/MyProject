package newproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\Downloads\\chromedriver_win32 (14)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        String title=driver.getTitle();
        System.out.println("the title is:"+title);
        System.out.println(title.length());
        String actualurl="https://www.google.com/";
        String expectedurl=driver.getCurrentUrl();
        System.out.println("the expected url is:"+expectedurl);
        if(actualurl==expectedurl)
        {
        	System.out.println("Actualurl and expectedurl are same");	
        }
        else {
        	System.out.println("Actualurl and expectedurl are not same");	
        }
        
        String pagesource=driver.getPageSource();
        System.out.println("Page length is:"+pagesource.length());
        
        driver.quit();
	}

}
