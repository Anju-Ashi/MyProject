package stepdefinition;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Toolsqa {
   WebDriver driver=null;
	
   @Before 
	public void setUp(){  
		System.setProperty("webdriver.chrome.driver", "C:\\\\\\\\Users\\\\\\\\Anjana\\\\\\\\Desktop\\\\\\\\drivers\\\\\\\\chromedriver\\\\\\\\chromedriver.exe");
	      driver = new ChromeDriver();    
	   }    
		
	      
	     
	@Given("toolsqa homepage")
	public void toolsqa_homepage() throws InterruptedException {
		  
		 driver.get("https://www.toolsqa.com/cucumber-tutorial/");
		 Thread.sleep(2000);
	}

	@When("click on demo site")
	public void click_on_demo_site() throws InterruptedException {
		driver.findElement(By.xpath("//strong[normalize-space()='Test Driven Development (TDD)']")).click();
		
	      Thread.sleep(2000);
	}
	@Then("demolinks opens and click on forms")
	public void demolinks_opens_and_click_on_forms() {
		driver.findElement(By.xpath("//span[@class='navbar__tutorial-menu--menu-bars']")).click();
	}
	@After 
	 public void cleanUp(){    
	      driver.quit();    
	}
}
