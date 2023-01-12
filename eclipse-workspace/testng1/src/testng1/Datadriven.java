package testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datadriven {
	
    	 @DataProvider(name="login")
    	 public Object[][] dataset(){
    		 return new Object[][] {
    			 {"mercury","123sd4"},
    			 {"mercury","d12345"},
    			 {"mercury1","f123"}};
    	 }
	@Test (dataProvider = "login")
	  public void login(String username,String  password) throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\Desktop\\drivers\\chromedriver\\chromedriver.exe");
	      WebDriver driver = new ChromeDriver();
	      driver.get("https://demo.guru99.com//test//newtours//index.php");
	      
	      driver.manage().window().maximize();
	      
	      Thread.sleep(2000);
	      driver.findElement(By.name("userName")).sendKeys(username);
	      driver.findElement(By.name("password")).sendKeys(password);
	      driver.findElement(By.xpath("//input[@name='submit']")).submit();
	      
	      
	  }
	      
	    
	  }

