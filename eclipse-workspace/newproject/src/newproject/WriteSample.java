package newproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteSample {

	
	public static void main(String[] args) throws IOException {
		String filename="Sample1.xlsx";
		File file =    new File("C:\\Users\\Anjana\\Desktop\\sample1.xlsx");
		FileInputStream inputStream = new FileInputStream(file);
		Workbook wb = null ;

	    
	    String fileExtensionName = filename.substring(filename.indexOf("."));
	    if(fileExtensionName.equals(".xlsx")){
	    	 wb=new XSSFWorkbook(inputStream);
	    }
	    else if(fileExtensionName.equals(".xls")) {
	    
			 wb=new HSSFWorkbook(inputStream);
	    }
	    
		Sheet sheet = wb.getSheet("Sheet1");	
	    int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
	    for(int i = 0; i < rowCount+1; i++) {
	    	Row row =  sheet.getRow(i);
	    	 for (int j = 0; j < row.getLastCellNum(); j++) {
	    		 System.out.print(row.getCell(j).getStringCellValue()+"|| "); 
	    	 }

	    	 System.out.println();
	}
	}

}
