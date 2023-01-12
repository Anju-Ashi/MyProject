import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import sampletest.ListenersTestNG;

public class Login {
  @Test (dataProvider = "login")
  public void login(String username,CharSequence[]  password) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\Desktop\\drivers\\chromedriver\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://demo.guru99.com//test//newtours//index.php");
      
      driver.manage().window().maximize();
      driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
      Thread.sleep(2000);
      driver.findElement(By.name("userName")).sendKeys(username);
      driver.findElement(By.name("password")).sendKeys(password);
      driver.findElement(By.xpath("//input[@name='submit']")).submit();
      
      
  }
      
     public class Dataprovider
     {
    	 @DataProvider(name="login")
    	 public Object[][] dataset(){
    		 return new Object[][] {
    			 {"mercury",1234},
    			 {"mercury",12345},
    			 {"mercury1",123}
    			 
    			 };
    	 }
  }
     
    	  
}  
      
     
     
      
      
      
      
      

	

  

