package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Readwritefile {

	public static void main(String[] args) throws IOException {
		Properties properties = new Properties();
		FileInputStream inputstram = new FileInputStream("C:\\Users\\Anjana\\eclipse-workspace\\readfile\\src\\test\\resources\\properties\\testdata.properties");
		properties.load(inputstram);
		System.out.println(properties.getProperty("browser"));
		System.out.println(properties.getProperty("url"));
		
		
		
		FileOutputStream output = new FileOutputStream("C:\\Users\\Anjana\\eclipse-workspace\\readfile\\src\\test\\resources\\properties\\testdata.properties");
		properties.setProperty("testdata" , "234445");
		properties.store(output, "this is customer data from tc2");
		
				

	}

}
