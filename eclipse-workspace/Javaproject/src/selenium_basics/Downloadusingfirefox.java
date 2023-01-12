package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Downloadusingfirefox {
public static void main(String[] args) throws InterruptedException {
		
		  
		
		System.setProperty("webdriver.gecko.driver", "C:/Users/Anjana/Desktop/drivers/geckodriver/geckodriver.exe");
		
	    FirefoxProfile profile=new FirefoxProfile();
		profile.setPreference("browser.helperApps.neverAsk", "text/plain");//set mime type(text/plain):https://docs.w3cub.com/http/basics_of_http/mime_types/complete_list_of_mime_types.html
		profile.setPreference("browser.download.manager.showWhenStarting", false);
		
		FirefoxOptions option= new FirefoxOptions();
		option.setProfile(profile);
		
		WebDriver driver=new FirefoxDriver(option);
		driver.get("http://demo.automationtesting.in/FileDownload.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("textbox")).sendKeys("testing");
		
		driver.findElement(By.id("createTxt")).click();
		driver.findElement(By.id("link-to-download")).click();
		
}

}
