package newproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookObjectdepository {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\Downloads\\chromedriver_win32 (14)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        
        driver.manage().window().maximize();
        Properties prop=new Properties();
        FileInputStream ip= new FileInputStream("C:\\Users\\Anjana\\eclipse-workspace\\newproject\\src\\newproject\\facebook.properties");
        prop.load(ip);
        driver.get("https://www.facebook.com/");
        driver.findElement( By.xpath(prop.getProperty("Createnewaccount_linktext"))).click();
        Thread.sleep(2000);
        driver.findElement( By.name(prop.getProperty("firstname_textbox_name"))).sendKeys(prop.getProperty("firstname"));
        driver.findElement( By.name(prop.getProperty("surname_textbox_name"))).sendKeys(prop.getProperty("Surname"));
        driver.findElement( By.name(prop.getProperty("textbox_email_name"))).sendKeys(prop.getProperty("email"));
        driver.findElement( By.name(prop.getProperty("password_textbox_name"))).sendKeys(prop.getProperty("password"));
        driver.findElement( By.name(prop.getProperty("button_signup_name"))).click();
      
        driver.quit();
	}

}
