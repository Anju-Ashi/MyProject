package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logintest {
	WebDriver driver=null;
	@Before 
	public void setUp(){    
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\Downloads\\chromedriver_win32 (14)\\chromedriver.exe");
	      
	      driver = new ChromeDriver();    
	   }    
	public void open_chrome_browser_and_start_flipkart_app() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\Downloads\\chromedriver_win32 (14)\\chromedriver.exe");
	      
	      driver.get("https://www.flipkart.com/");
	      
	      Thread.sleep(2000);
	}
	@When("enteres username  and password")
	public void enteres_username_and_password() {
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).click();
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).click();
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("7907703742");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("anjana123anjana");
		
	}
	@Then("login successfully")
	public void login_successfully() {
		driver.findElement(By.xpath("//button[@type='submit']//span[contains(text(),'Login')]")).click();
		System.out.println("Login succesfull");

	}
	@Given("Open chrome browser and start flipkart app")
	public void open_chrome_browser_and_start_flipkart_app1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\Downloads\\chromedriver_win32 (14)\\chromedriver.exe");
	       
	      driver.get("https://www.flipkart.com/");
	      
	      Thread.sleep(2000);
	}
	@When("enteres invalid username  and password")
	public void enteres_invalid_username_and_password() {
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).click();
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("7907703742");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("anjana123anjana");
	}
	@Then("login unsuccesfully")
	public void login_unsuccesfully() {
		driver.findElement(By.xpath("//button[@type='submit']//span[contains(text(),'Login')]")).click();
		System.out.println("Login unsuccesfull");
	}
	 @After 
	 public void cleanUp(){    
	      driver.quit();    

	 }
}
