import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\Desktop\\drivers\\chromedriver\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.get("https://www.google.com/");
      String title=driver.getTitle();
      System.out.println("the title is:"+title);
      System.out.println(title.length());
      String actualurl="https://www.google.com/";
      String expectedurl=driver.getCurrentUrl();
      System.out.println("the expected url is:"+expectedurl);
      if(actualurl==expectedurl)
      {
      	System.out.println("Actualurl and expectedurl are same");	
      }
      else {
      	System.out.println("Actualurl and expectedurl are not same");	
      }
      
      String pagesource=driver.getPageSource();
      System.out.println("Page length is:"+pagesource.length());
      
      driver.quit();
	}
  }

