package selenium_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardevents {

	public static void main(String[] args) throws InterruptedException {
		("/html[1]/body[1]/div[2]/div[3]/div[1]/div[2]/div[2]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[5]/div[4]/pre[1]/span[1]"));
		Thread.sleep(2000);
		Actions actions = new Actions(driver);
		Thread.sleep(2000);
		actions.keyDown(text1,Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		Thread.sleep(2000);
		WebElement text2 = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[1]/div[3]/div[2]/div[1]/div[6]/div[1]/div[1]/div[1]/div[1]/div[5]/div[6]/pre[1]"));
		Thread.sleep(2000);
		actions.keyDown(text2,Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
		Thread.sleep(2000);
		

	}

}
