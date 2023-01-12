import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class demo99 {
	public String url=("https://demo.guru99.com/");
	String driverPath = "C:\\Users\\Anjana\\Desktop\\drivers\\chromedriver\\chromedriver.exe";
	public WebDriver driver ;
	
	

  @BeforeTest
  public void launchbrowser() {
	  System.setProperty("webdriver.chrome.driver", driverPath);
	  Reporter.log("launched browser");
		driver = new ChromeDriver();
		
  }
  @BeforeTest
  public void login() throws InterruptedException {
	  driver.get(url);
	  WebElement search=driver.findElement(By.name("emailid"));
      search.sendKeys("anjanaraj00@gmail.com");
      driver.findElement(By.name("btnLogin")).submit();
      Reporter.log("entered emailid ");
      Thread.sleep(2000);
}
  
  @Test(priority=0, dataProvider = "login",dataProviderClass=Dataprovider.class) 
  public void login1(String username,String password) throws InterruptedException {
	  driver.navigate().to("https://demo.guru99.com/V4/");
	  driver.findElement(By.name("uid")).sendKeys(username);
	  driver.findElement(By.name("password")).sendKeys(password);
	  driver.findElement(By.name("btnLogin")).click();
	  String actualurl="https://demo.guru99.com/V4/manager/Managerhomepage.php";
	  String expectedurl=driver.getCurrentUrl();
	  Assert.assertEquals(actualurl, expectedurl);
	  System.out.println("login in with valid credentials");
	  Reporter.log("login with valid credentials");
	  Thread.sleep(2000);
	  
  }
  @Test(priority=1,dataProvider = "login",dataProviderClass=Dataprovider.class)
  public void login2(String username,String password) throws InterruptedException {
	  driver.navigate().to("https://demo.guru99.com/V4/");
	  driver.findElement(By.name("uid")).sendKeys(username);
	  driver.findElement(By.name("password")).sendKeys(password);
	  driver.findElement(By.name("btnLogin")).click();
	  driver.switchTo().alert().accept();
	  String actualurl="https://demo.guru99.com/V4/manager/Managerhomepage.php";
	  String expectedurl=driver.getCurrentUrl();
	  Assert.assertNotEquals(actualurl, expectedurl);
	  System.out.println("Username is invalid");
	  Reporter.log("login with invalid username");
	  Thread.sleep(2000);
	  
  }
  @Test(priority=2,dataProvider = "login",dataProviderClass=Dataprovider.class)
  public void login3(String username,String password) throws InterruptedException {
	  driver.navigate().to("https://demo.guru99.com/V4/");
	  driver.findElement(By.name("uid")).sendKeys(username);
	  driver.findElement(By.name("password")).sendKeys(password);
	  driver.findElement(By.name("btnLogin")).click();
	  driver.switchTo().alert().accept();
	  String actualurl="https://demo.guru99.com/V4/manager/Managerhomepage.php";
	  String expectedurl=driver.getCurrentUrl();
	  Assert.assertNotEquals(actualurl, expectedurl);
	  System.out.println("Password is invalid");
	  Reporter.log("login with invalid password");
	  Thread.sleep(2000);
	  
  }
  @Test(priority=3,dataProvider = "login",dataProviderClass=Dataprovider.class)
  public void login4(String username,String password) throws InterruptedException {
	  driver.navigate().to("https://demo.guru99.com/V4/");
	  driver.findElement(By.name("uid")).sendKeys(username);
	  driver.findElement(By.name("password")).sendKeys(password);
	  driver.findElement(By.name("btnLogin")).click();
	  driver.switchTo().alert().accept();
	  String actualurl="https://demo.guru99.com/V4/manager/Managerhomepage.php";
	  String expectedurl=driver.getCurrentUrl();
	  Assert.assertNotEquals(actualurl, expectedurl);
	  System.out.println("Username and Password is  invalid");
	  Reporter.log("login with invalid credentials");
	  Thread.sleep(2000);
	  
  }
  @AfterTest
  public void closebrowser() {
	  Reporter.log("Closed browser");
	  driver.quit();
  }
}