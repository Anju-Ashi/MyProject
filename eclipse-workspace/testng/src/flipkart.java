import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class flipkart {
	public String url=("https://www.amazon.in/");
	String driverPath = "C:\\\\Users\\\\Anjana\\\\Desktop\\\\drivers\\\\chromedriver\\\\chromedriver.exe";
	public WebDriver driver ;
    
	
	
  @BeforeTest
  public void launchbrowser() {
	  System.setProperty("webdriver.chrome.driver", driverPath);
       driver = new ChromeDriver();
      driver.get(url);
  }
  
  
  @Test(priority=1)
  public void searchproduct() throws InterruptedException {
	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 13");
      Thread.sleep(2000);
	  List<WebElement>list=driver.findElements(By.className("s-suggestion-container"));
      System.out.println("List size is:"+list.size());
      for(int i=0;i<list.size();i++) {
    	// by mistake delete
      	
      	
      
       if (list.get(i).getText().equalsIgnoreCase("iphone 13 pro max")) {
      	 list.get(i).click();
      	 break;
       }
      		
      } 
  }
  
  
  @Test(priority=2)
  public void clickonsearchproduct() throws InterruptedException {
	  Thread.sleep(2000);
	  JavascriptExecutor js = (JavascriptExecutor) driver;
      WebElement iphone=driver.findElement(By.xpath("//*[@id=\'search\']/div[1]/div[1]/div/span[3]/div[2]/div[20]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
      js.executeScript("arguments[0].scrollIntoView();", iphone);
         iphone.click();
         Thread.sleep(2000);
  }
  
  
  @Test(priority=3)
  public void switchtonextwindow() throws InterruptedException {
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
  }
  @Test(priority=4)
  public void addtocart() throws InterruptedException {
	  
      WebElement element=driver.findElement(By.name("submit.add-to-cart"));
      Actions act=new Actions(driver);
      act.click(element).perform();
      Thread.sleep(2000);
  }
  @Test(priority=5)
  public void verifyconfirmationmsg() throws InterruptedException {
	  Thread.sleep(2000);
	  WebElement element=driver.findElement(By.xpath("//*[@id=\"attachDisplayAddBaseAlert\"]/span"));
      if(element.isDisplayed());
      {
      	System.out.println("product added to cart-Parallell Testing");
      }
      Thread.sleep(2000);
      
  }
  @AfterTest
  public void closebrowser() {
	  driver.quit();
  }
}
