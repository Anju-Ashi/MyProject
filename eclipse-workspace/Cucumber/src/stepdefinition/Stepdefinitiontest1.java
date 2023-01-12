package stepdefinition;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinitiontest1 {
	WebDriver driver;

	@Before 
	public void setUp(){  
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\Anjana\\\\\\\\Desktop\\\\\\\\drivers\\\\\\\\chromedriver\\\\\\\\chromedriver.exe");
	      driver = new ChromeDriver();    
	   }    
	@Given("user on homepage and search product")
	public void user_on_homepage_and_search_product() throws InterruptedException {
		
	      
	      driver.get("https://www.amazon.in/");
	      driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 13");
	      Thread.sleep(2000);
	}

	@When("user click on searched product")
	public void user_click_on_searched_product() throws InterruptedException {
		List<WebElement>list=driver.findElements(By.className("s-suggestion-container"));
	      System.out.println("List size is:"+list.size());
	      for(int i=0;i<list.size();i++) {
	    	// by mistake delete
	      	
	      	
	      
	       if (list.get(i).getText().equalsIgnoreCase("iphone 13 pro max")) {
	      	 list.get(i).click();
	      	 break;
	       }
	      		
	      } JavascriptExecutor js = (JavascriptExecutor) driver;
	      WebElement iphone=driver.findElement(By.xpath("//*[@id=\'search\']/div[1]/div[1]/div/span[3]/div[2]/div[20]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span"));
	      js.executeScript("arguments[0].scrollIntoView();", iphone);
	         iphone.click();
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
	}

	@When("product is added to cart")
	public void product_is_added_to_cart() throws InterruptedException {
		WebElement element=driver.findElement(By.name("submit.add-to-cart"));
	      Actions act=new Actions(driver);
	      act.click(element).perform();
	      Thread.sleep(2000);
	}

	@Then("verify confirmation message")
	public void verify_confirmation_message() throws InterruptedException {
		 Thread.sleep(2000);
		  WebElement element=driver.findElement(By.xpath("//*[@id=\"attachDisplayAddBaseAlert\"]/span"));
	      if(element.isDisplayed());
	      {
	      	System.out.println("product added to cart");
	      }
	      Thread.sleep(2000);
	}
}
