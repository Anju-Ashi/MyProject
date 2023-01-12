package newproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\Downloads\\chromedriver_win32 (14)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        
        driver.manage().window().maximize();
        Select select=new Select(driver.findElement(By.name("country")));
        select.selectByVisibleText("YEMEN");
       
        List<WebElement>elements=select.getOptions();
       
        int elem=elements.size();
        System.out.println("Number of elements:"+elem);
        for(int i=0;i<elem;i++) {
        	String value=elements.get(i).getText();
        	System.out.println(value);
        }
        
       
        
        
       

       // for (int i=0;i<elements.size();i++) {

	}

}
