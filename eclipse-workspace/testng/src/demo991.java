import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import sampletest.Retry;

public class demo991 {
	public String url=("https://demo.guru99.com/");
	String driverPath = "C:\\Users\\Anjana\\Desktop\\drivers\\chromedriver\\chromedriver.exe";
	public WebDriver driver ;
	
	@BeforeTest
	  public void launchbrowser() {
		  System.setProperty("webdriver.chrome.driver", driverPath);
			driver = new ChromeDriver();
			
	  }
	  @BeforeTest
	  public void login() throws InterruptedException {
		  driver.get(url);
		  WebElement search=driver.findElement(By.name("emailid"));
	      search.sendKeys("anjanaraj00@gmail.com");
	      driver.findElement(By.name("btnLogin")).submit();
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
		  Thread.sleep(2000);
		  
	  }
	  @AfterTest
	  public void closebrowser() {
		  driver.quit();
	  }
}
