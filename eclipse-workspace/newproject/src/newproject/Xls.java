package newproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xls {

	public static void main(String[] args) throws IOException {
	FileInputStream inputstream=new FileInputStream("C:\\Users\\Anjana\\Desktop\\sample.xlsx");
	@SuppressWarnings("resource")
	XSSFWorkbook wb=new XSSFWorkbook(inputstream);
	XSSFSheet sheet=wb.getSheet("Sheet1");
	
	Row row=sheet.getRow(3);
	Cell cell=row.getCell(2);
	
	System.out.println(cell);
	
	System.out.println(sheet.getRow(0).getCell(2));
	
	}

}
