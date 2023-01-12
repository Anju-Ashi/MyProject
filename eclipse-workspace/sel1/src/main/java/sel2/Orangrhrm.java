package sel2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
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

  @Test(dataProvider="logincredentials")
  public void logintestTest(String uname,String passwd) {
   
    
	driver.findElement(By.id("txtUsername")).sendKeys(uname);
	driver.findElement(By.id("txtPassword")).sendKeys(passwd);
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
	  
  

@DataProvider() 
public static Object[][] logincredentials(){
	  return new Object[][] {{"admin","admin123"},{"admin","admin123"},{"123","123456"}};
}

}

