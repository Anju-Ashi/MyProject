package newproject;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Managebrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\Downloads\\chromedriver_win32 (14)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        
        driver.manage().window().maximize();
        
        
        Dimension dimension = driver.manage().window().getSize();
        System.out.println("Height:"+dimension.height);
        System.out.println("Width:"+dimension.width);
        Thread.sleep(2000);

        
        Point point=driver.manage().window().getPosition();
        System.out.println("X offset:"+point.x);
        System.out.println("X offset:"+point.y);
        Thread.sleep(2000);

        
        Dimension dimension1= new Dimension(600,700);
        driver.manage().window().setSize(dimension1);
        Thread.sleep(2000);

        
        
        Point point1=new Point(1000,1500);
        driver.manage().window().setPosition(point1);
        Thread.sleep(2000);
        
        driver.quit();

        
        

	}

}
