package newproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.internal.annotations.DataProviderAnnotation;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;


public class Facebookform {

	
		public String url=("https://www.facebook.com/");
		String driverPath = "C:\\Users\\Anjana\\Desktop\\drivers\\chromedriver\\chromedriver.exe";
		public WebDriver driver ;
		 @BeforeTest
		  public void launchbrowser() {
			  System.setProperty("webdriver.chrome.driver", driverPath);
				driver = new ChromeDriver();
				
		  }
        
		@Test(priority=0, dataProvider = "facebook",dataProviderClass=Dataprovider.class) 
        public void create(String firstname,String lastname,String password) throws InterruptedException {
        driver.manage().window().maximize();
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.get(url);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys(firstname);
        driver.findElement(By.name("lastname")).sendKeys(lastname);
        WebElement number=driver.findElement(By.name("reg_email__"));
        number.sendKeys(password);
        driver.findElement(By.name("reg_passwd__")).sendKeys("12345678");
        
        
        //dropdown
        WebElement birthday=driver.findElement(By.name("birthday_day"));
        WebElement birthmonth=driver.findElement(By.name("birthday_month"));
        WebElement birthyear=driver.findElement(By.name("birthday_year"));
        Select select=new Select(birthday);
        select.selectByValue("20");
        Thread.sleep(2000);
        Select select1=new Select(birthmonth);
        select1.selectByValue("7");
        Thread.sleep(2000);
        Select select2=new Select(birthyear);
        select2.selectByValue("2016");
        Thread.sleep(2000);
        
        
        //radiobutton
        driver.findElement(By.name("sex")).click();
        
        
        //dropdown
       driver.findElement(By.name("websubmit")).click();
        
        Thread.sleep(2000);
        
       
       
        
        
        }
        
        

	}


