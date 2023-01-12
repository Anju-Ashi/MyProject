package newproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WEbelementcommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\Downloads\\chromedriver_win32 (14)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        
        driver.manage().window().maximize();
        driver.findElement(By.id("userName")).clear();
         
        driver.findElement(By.id("userName")).sendKeys("Anjana");
        
        boolean elem=driver.findElement(By.id("submit")).isEnabled();
        System.out.println(elem);
        Thread.sleep(2000);
        
        driver.navigate().to("https://demoqa.com/radio-button");
        WebElement radiobutton=driver.findElement(By.tagName("label"));
        System.out.println(radiobutton.isDisplayed());
        System.out.println(radiobutton.isEnabled());
        System.out.println(radiobutton.isSelected());
        Thread.sleep(2000);
        
        
        driver.navigate().back();
        WebElement submit=driver.findElement(By.id("submit"));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
        jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", submit);
        String text=submit.getText();
        System.out.println(text);
        String tagname=submit.getTagName();//get tagname
        System.out.println(tagname);
        submit.submit();
        Thread.sleep(2000);
       
        driver.navigate().to("https://demoqa.com/buttons");
        WebElement ele=driver.findElement(By.id("doubleClickBtn"));
        ele.getText();
        ele.getAttribute("id");//getattribute
        System.out.println(ele);
        Dimension dimension=ele.getSize();//getsize
        System.out.println("width:"+dimension.width);
        System.out.println("Height:"+dimension.height);
        
        Point pt=ele.getLocation();//getlocation
        System.out.println("x.offset"+pt.x);
        System.out.println("y.offset"+pt.y);
        Thread.sleep(2000);
        driver.quit();
        
        
        
        
        
        
        
        
        
	}

}
