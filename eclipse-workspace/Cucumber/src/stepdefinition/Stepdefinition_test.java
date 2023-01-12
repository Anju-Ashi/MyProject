package stepdefinition;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition_test {
	WebDriver driver;
	@Given("useris on login page")
	public void useris_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\Downloads\\chromedriver_win32 (14)\\chromedriver.exe");
       
       driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/V4/");
	}
	@When("user enteres {string}  and {string}")
	public void user_enteres_and(String username, String password) {
		driver.findElement(By.name("uid")).sendKeys(username);
		  driver.findElement(By.name("password")).sendKeys(password);
		  
	    
		
	}
	@Then("login successfully")
	public void login_successfully() {
		driver.findElement(By.name("btnLogin")).click();
		
	}
}
