package sel1;

import java.awt.Image;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Assertion {
	
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
	   boolean image= driver.findElement(By.xpath("//div[@id='divLogo']//img")).isDisplayed();
	  
	  Assert.assertTrue(image);
	  }

	  private WebElement findElement(By xpath) {
		// TODO Auto-generated method stub
		return null;
	}

	@Test
	  public void logintestTest() {
	   
	    
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.className("button")).click();
		String actualurl=driver.getCurrentUrl();
		String Expectedurl="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
		Assert.assertEquals(actualurl, Expectedurl);
	  }

	  
	  
	  @Test
	  public void verifytitletestTest() throws InterruptedException {
	    
		  
	    String actualtitle=driver.getTitle();
	    String expectedtitle="OrangeHRM";
	    Assert.assertEquals(actualtitle, expectedtitle);
	    Thread.sleep(2000);
	     
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

