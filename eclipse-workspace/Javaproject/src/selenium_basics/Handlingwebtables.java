package selenium_basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingwebtables {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\Desktop\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.marketindex.com.au/asx200");
		driver.manage().window().maximize();
		
		List<WebElement> rows = driver.findElements(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[3]/div[2]/div/div/div[2]/table/tbody/tr"));
		int row1 = rows.size();
		System.out.println(row1);
		@SuppressWarnings("unused")
		List<WebElement> coloumn = driver.findElements(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[3]/div[2]/div/div/div[2]/table/tbody/tr[2]/td"));
		int col1 = rows.size();
		System.out.println(col1);
		
		for(int i=1;i<=row1;i++)
		{
			for(int j=1;j<=col1;j++)
			{
				
				
				WebElement result = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[3]/div[2]/div/div/div[2]/table/tbody/tr["+i+"]/td["+j+"]"));
				System.out.println(((WebElement) result).getText());
				Thread.sleep(3000);
			}

		}
		

	}

}
