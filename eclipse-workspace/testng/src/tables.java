import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class tables {
	public String url=("https://demo.guru99.com/test/newtours/");
	String driverPath = "C:\\Users\\Anjana\\Downloads\\chromedriver_win32 (14)\\chromedriver.exe";
	public WebDriver driver ;
  @BeforeTest
  public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(url);
		  }
  @Test
  public void gettable() {
	  WebElement search=driver.findElement(By.xpath("//table/tbody/tr[3]/td[@width='190']"));
	  System.out.println(search.getText());
  }
  @AfterTest
  public void closebrowser() {
	  driver.quit();
}
}
