package newproject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandles {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\Downloads\\chromedriver_win32 (14)\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://demo.guru99.com/popup.php");
	      
	       
	        WebElement element=driver.findElement(By.linkText("Click Here"));
	        element.click();
	        Thread.sleep(2000);
	        String mainwindow=driver.getWindowHandle();
	        System.out.println("Main window handle is " +mainwindow);
	        Set<String>set=driver.getWindowHandles();
	        System.out.println("Child window handle is" + set);
	        Iterator<String>it=set.iterator();
	        while(it.hasNext()) {
	        	String childwindow=it.next();
	        	if(!mainwindow.equalsIgnoreCase(childwindow)) {
	        		driver.switchTo().window(childwindow);
	        	}
	        	 
	        	
	        
	        }
	        Thread.sleep(2000);
    		WebElement email=driver.findElement(By.name("emailid"));
    		
    		email.sendKeys("abc");
    		driver.findElement(By.name("btnLogin")).click();
	}
	}


