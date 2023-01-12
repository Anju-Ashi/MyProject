package sel1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangrhrm{
	WebDriver driver;

  @Test
  @BeforeClass
  public  void LaunchingTestTest() {
   
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\Desktop\\drivers\\chromedriver\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
  }

  @Test
  public void launchtestTest() {

   driver.get("https://opensource-demo.orangehrmlive.com/");
  }

  @Test
  public void logintestTest() {
   
    
	driver.findElement(By.id("txtUsername")).sendKeys("admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.className("button")).click();
  }

  
  
  @Test
  public void verifytitletestTest() throws InterruptedException {
    
	  
    String title=driver.getTitle();
     
  }
  @Test
  public void logouttestTest1() {
    
    driver.findElement(By.id("welcome")).click();
  }
  @Test
  @AfterClass
  public void teardown() {
	    
	    driver.close();
	  }
	  
  
}


