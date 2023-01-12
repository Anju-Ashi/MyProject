package sampletest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tripadvisor {
	public String url=("https://www.tripadvisor.in/");
	String driverPath = "C:\\Users\\Anjana\\Desktop\\drivers\\chromedriver\\chromedriver.exe";
	public WebDriver driver ;
  @BeforeTest
  public void launchbrowser() {
	  System.setProperty("webdriver.chrome.driver", driverPath);
      driver = new ChromeDriver();
     driver.get(url);
  }
  @Test(priority=1)
  public void searchclubmahindre() throws InterruptedException {
	  WebElement search=driver.findElement(By.xpath("//input[@placeholder='Where to?']"));
	  search.click();
	  search.sendKeys("Club Mahindra");
	  search.sendKeys(Keys.ENTER);
	  Thread.sleep(2000);
  }
  @Test(priority=2)
  public void resultsclick() throws InterruptedException {
	  WebElement results=driver.findElement(By.xpath("//span[normalize-space()='Club Mahindra Madikeri, Coorg']"));
	  results.click();
	  String mainwindow=driver.getWindowHandle();
      System.out.println("Main window handle is " +mainwindow);
      Set<String>set=driver.getWindowHandles();
      System.out.println("Child window handle is" + set);
      Iterator<String>it=set.iterator();
      while(it.hasNext()) {
      	String childwindow=it.next();
      	if(!mainwindow.equalsIgnoreCase(childwindow)) {
      		driver.switchTo().window(childwindow);
      		Thread.sleep(2000);
      	}
      	}
  }
  @Test(priority=3)
  public void writeareview() throws InterruptedException {
	  
	  WebElement writereview=driver.findElement(By.xpath("(//a[normalize-space()='Write a review'])[1]"));
	  
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	  js.executeScript("arguments[0].scrollIntoView();", writereview);
	  Thread.sleep(2000);
	  Actions action = new Actions(driver);

	  action.moveToElement(writereview).click().perform();
      Thread.sleep(2000);
      System.out.println("Current Window Handle: " + driver.getWindowHandle() + "\n");
      Set<String> windowHandles = driver.getWindowHandles();
      List<String> windowHandlesList = new ArrayList<>(windowHandles);
      System.out.println("Total window number: " + windowHandlesList.size() + "\n");
      driver.switchTo().window(windowHandlesList.get(1));
      System.out.println("Current Window Handle: " + driver.getWindowHandle() + "\n");
      
      	}
  
  @Test(priority=4)
  public void clickstar() throws InterruptedException {
	  Actions actions = new Actions(driver);
	 WebElement element1=driver.findElement(By.xpath("//select[@id='qid10']//option[@value='1'][normalize-space()='1']"));
	 System.out.println(element1.isSelected());
	 Thread.sleep(2000);
	 WebElement element2=driver.findElement(By.xpath("//select[@id='qid10']//option[@value='2'][normalize-space()='2']"));
	 System.out.println(element2.isSelected());
	 Thread.sleep(2000);
	 WebElement element3=driver.findElement(By.xpath("//select[@id='qid10']//option[@value='3'][normalize-space()='3']"));
	 System.out.println(element3.isSelected());
	 Thread.sleep(2000);
	 WebElement element4=driver.findElement(By.xpath("//select[@id='qid10']//option[@value='4'][normalize-space()='4']"));
	 System.out.println(element4.isDisplayed());
	 
	 Thread.sleep(2000);
	 WebElement element5=driver.findElement(By.xpath("//select[@id='qid10']//option[@value='4'][normalize-space()='4']"));
	 System.out.println(element4.isDisplayed());
	 
	 Thread.sleep(2000);
	 
	  
		    
	        
	        
	        Thread.sleep(2000);
	        
	        
	        
	        
	  }
@Test (priority=5) 
public void review() throws InterruptedException {
	driver.findElement(By.xpath("//input[@id='ReviewTitle']")).sendKeys("ABC");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//textarea[@id='ReviewText']")).sendKeys("abcdef");
	Thread.sleep(2000);
}
  
@AfterTest
  public void closebrowser() {
	  driver.quit();
  }
}
