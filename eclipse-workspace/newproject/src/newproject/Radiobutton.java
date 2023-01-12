package newproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Radiobutton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\Downloads\\chromedriver_win32 (14)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/radio.html");
        
        driver.manage().window().maximize();
       
       
        System.out.println("Number of elements:"+elements.size());
        System.out.println(elements.size());
       

        for (int i=0;i<elements.size();i++) {
        	Boolean list1=elements.get(i).isSelected();
            System.out.println( list1);
        }
            for (int i=0;i<elements.size();i++) {
            	
            	Boolean list2=elements.get(i).isDisplayed();
                System.out.println( list2);
            }
            for (int i=0;i<elements.size();i++) {
            	
            	Boolean list3=elements.get(i).isSelected();
                System.out.println( list3);
            }
            List<WebElement> element=driver.findElements(By.name("webform"));
            for (int i=0;i<element.size();i++) {
            element.get(i).click();
            System.out.println(element.get(i).isSelected());
            Thread.sleep(2000);
            
            
            
	}
            driver.quit();
            
            
            		
            
        
        	
        
	}

}
