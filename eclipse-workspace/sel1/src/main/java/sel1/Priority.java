package sel1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Priority {
	WebDriver driver;

	  @Test
	  @BeforeClass
	  public  void setup() {
	   
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\Desktop\\drivers\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	  }

	  @Test
	  public void aTestcase() {

	   driver.get("https://opensource-demo.orangehrmlive.com/");
	   boolean image= driver.findElement(By.xpath("//div[@id='divLogo']//img")).isDisplayed();
	  
	  Assert.assertTrue(image);
	  }

	 
	

	@Test(invocationCount = 3)
	  public void bTestcase() {
	   
	    
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.className("button")).click();
		String actualurl=driver.getCurrentUrl();
		String Expectedurl="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		Assert.assertEquals(actualurl, Expectedurl);
	  }

	  
	  
	  @Test
	  public void cTestcase() {
	    
		  
	    String actualtitle=driver.getTitle();
	    String expectedtitle="OrangeHRM";
	    Assert.assertEquals(actualtitle, expectedtitle);
	    //Thread.sleep(2000);
	     
	  }
	  @Test
	  public void dTestcase() throws InterruptedException {
	    
	    driver.findElement(By.id("welcome")).click();
	    Thread.sleep(3000);
	  }
	  @Test
	  @AfterClass
	  public void teardown() {
		    
		    driver.close();
		  }
		  

}
