
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.server.handler.W3CActions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.TouchActions;

public class Exampledownloadapkonvd {
	
	
	
	

	
           
		   
			public static void main(String[] args) throws MalformedURLException, InterruptedException    {
		       

		        DesiredCapabilities dc= new DesiredCapabilities();
		       
		        dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		       
		        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		       
		        dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.0");
		       
		        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy Nexus API");
		       

		        dc.setCapability("apPpackage", "com.coolbase.androidprograming");
		        
		        dc.setCapability("appActivity", "com.android.calculator2.Calculator");
		        URL url =new URL("http://localhost:4723/wd/hub");

		       
		        AndroidDriver driver = new AndroidDriver(url,dc);
		        
                driver.findElement( By.id("com.google.android.calculator:id/digit_7")).click();
		        
		        driver.findElement( By.id("com.google.android.calculator:id/op_add")).click();
		        
		        driver.findElement( By.id("com.google.android.calculator:id/digit_5")).click();
		        WebElement views= driver.findElementbyId()
		        AndroidTouchAction action =new AndroidTouchAction(driver);
		        action.tap(TapOptions.tapOptions().withElement(ElementOption.element(views))).perform();
		        driver.quit();
		      
		        		
		    }

			




			
			}




			




			
		



