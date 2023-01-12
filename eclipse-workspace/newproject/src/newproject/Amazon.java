package newproject;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\Downloads\\chromedriver_win32 (14)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 13");
        Thread.sleep(2000);
        List<WebElement>list=driver.findElements(By.className("s-suggestion-container"));
        System.out.println("List size is:"+list.size());
        for(int i=0;i<list.size();i++) {
        	System.out.println(list.get(i).getText());
        	
        	
        
         if (list.get(i).getText().equalsIgnoreCase("iphone 13 pro max")) {
        	 list.get(i).click();
        	 break;
         }
        		
        } 
         Thread.sleep(2000);
         JavascriptExecutor js = (JavascriptExecutor) driver;
         WebElement iphone=driver.findElement(By.xpath("//*[@id=\'search\']/div[1]/div[1]/div/span[3]/div[2]/div[20]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
         js.executeScript("arguments[0].scrollIntoView();", iphone);
            iphone.click();
            Thread.sleep(2000);
            
            //switch to child window
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
	        
	        //Add to cart
            WebElement element=driver.findElement(By.name("submit.add-to-cart"));
            Actions act=new Actions(driver);
            act.click(element).perform();
            Thread.sleep(2000);
            WebElement elememt=driver.findElement(By.xpath("//*[@id=\"attachDisplayAddBaseAlert\"]/span"));
            if(element.isDisplayed());
            {
            	System.out.println("product added to cart");
            }
            Thread.sleep(2000);
            
            
            
            
          driver.quit();
            

	
	}
	}



