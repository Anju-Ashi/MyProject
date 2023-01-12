package sampletest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Yatra {
	public String url=("https://www.yatra.com/");
	String driverPath = "C:\\Users\\Anjana\\Desktop\\drivers\\chromedriver\\chromedriver.exe";
	public WebDriver driver ;
	public WebDriverWait wait2 ;
	
	
	 
	
	@BeforeTest
	  public void setup() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", driverPath);
			driver = new ChromeDriver();
			driver.get(url);
			
	
		 
		driver.findElement(By.xpath("//input[@id='BE_flight_origin_city']")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='BE_flight_origin_city']")).sendKeys("Kochi");
		 
		 driver.findElement(By.xpath("//*[@id=\"BE_flight_form_wrapper\"]/div[1]/div[2]/ul/li[1]/ul/li[1]/div/div/ul/div/div/div/li[1]/div[1]/p[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@id='BE_flight_arrival_city']")).sendKeys("Goa");
		 driver.findElement(By.xpath("//*[@id=\"BE_flight_form_wrapper\"]/div[1]/div[2]/ul/li[1]/ul/li[3]/div/div/ul/div/div/div/li[1]/div[1]/p[2]")).click();
		 Thread.sleep(2000);
	}
	
	@Test(priority=2)
		public void datetest() throws InterruptedException {
		new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='BE_flight_origin_date']")));
		 WebElement ele=driver.findElement(By.xpath("//input[@id='BE_flight_origin_date']"));
		 ele.sendKeys("24/10/2022");
		 Thread.sleep(2000);
		
		 WebElement ele1 = driver.findElement(By.xpath("//span[@class='txt-ellipses flight_passengerBox travellerPaxBox']"));
		 JavascriptExecutor executor = (JavascriptExecutor)driver;
		 executor.executeScript("arguments[0].click();", ele1);
		 Thread.sleep(2000);
	}
	@Test(priority=3)
		 public void adulttest() throws InterruptedException {
		Thread.sleep(2000);
		 WebElement ele2 = driver.findElement(By.xpath("//body//div//div[@data-flightagegroup='adult']//div[@data-flightagegroup='adult']//div//span[2]"));
		 JavascriptExecutor executor = (JavascriptExecutor)driver;
			 executor.executeScript("arguments[0].click();", ele2);
			 WebElement ele3 = driver.findElement(By.xpath("//body//div//div[@data-flightagegroup='adult']//div[@data-flightagegroup='adult']//div//span[2]"));
				 JavascriptExecutor js = (JavascriptExecutor)driver;
				 js.executeScript("arguments[0].click();", ele3);
		 
		 }
	@Test(priority=4)
		 public void radiobuttontest() throws InterruptedException {
		Thread.sleep(2000);
		 WebElement ele4 = driver.findElement(By.xpath("//div[@class='flight_passengerBox dflex relative']//li[2]"));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			 executor.executeScript("arguments[0].click();", ele4);
			 WebElement ele5 = driver.findElement(By.xpath("//a[normalize-space()='Senior Citizen']"));
				// JavascriptExecutor executor = (JavascriptExecutor)driver;
				 executor.executeScript("arguments[0].click();", ele5);
		 Thread.sleep(2000);
		 }
	@Test(priority=5)
		 public void searchflighttest() throws InterruptedException {
		 new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(By.id("BE_flight_flsearch_btn")));
		 Thread.sleep(2000);
		
	 }
	
	 @AfterTest
	  public void closebrowser() {
		  driver.quit();
	  }
}
