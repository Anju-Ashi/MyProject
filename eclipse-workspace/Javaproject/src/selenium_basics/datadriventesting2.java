package selenium_basics;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class datadriventesting2 {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anjana\\Desktop\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
		driver.manage().window().maximize();
		FileInputStream file = new FileInputStream("C:/Users/Anjana/OneDrive/Documents/Book12.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rowcount = sheet.getLastRowNum();
		int colcount = sheet.getRow(0).getLastCellNum();
		for(int i=1;i<=rowcount;i++)
		{
			XSSFRow row = sheet.getRow(i);
			
			XSSFCell principlecell = row.getCell(0);
			int princ=(int)principlecell.getNumericCellValue();
			
			XSSFCell roicell = row.getCell(1);
			int rointrst=(int)roicell.getNumericCellValue();
			
			XSSFCell periodcell = row.getCell(0);
			int per=(int)periodcell.getNumericCellValue();
			
			XSSFCell frequencycell = row.getCell(0);
			int fre=(int)frequencycell.getNumericCellValue();
			
			XSSFCell maturitycell = row.getCell(0);
			int mat=(int)maturitycell.getNumericCellValue();





	}
		driver.findElement(By.id("principal")).senKeys(String.valueOf(princ));
		
		driver.findElement(By.id("interest")).senKeys(String.valueOf(rointrst));
		driver.findElement(By.id("tenure")).senKeys(String.valueOf(per));
		
		Select periodd = new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
		periodd.selectByValue(1);
		
		Select freq = new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
		freq.selectByValue(0);
		
		driver.findElement(By.xpath("//img[@src='https://images.moneycontrol.com/images/mf_revamp/btn_calcutate.gif']"));
		
		
		
		
		

}
;