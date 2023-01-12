package selenium_basics;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class Uploadusingsikuli {

	public static void main(String[] args) throws FindFailed, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\Desktop\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='imagesrc']")).click();
		
		String fileNamePath = "C:\\Users\\Anjana\\Pictures\\sikulipics";
		String inputFilePath = "C:\\Users\\Anjana\\Pictures\\sikulipics";
		
		Screen s = new Screen();
		
		Pattern fileInputTextbox = new Pattern(fileNamePath + "Screenshot1.png");
		Pattern Openbutton = new Pattern(inputFilePath + "Screenshot2.png");
		Thread .sleep(5000);
		 
		s.wait(fileInputTextbox,20);
		s.type(Openbutton,inputFilePath+ "download.jpg");
		s.click(Openbutton);
		driver.close();
		 
		 
		 
		 

	}

}
