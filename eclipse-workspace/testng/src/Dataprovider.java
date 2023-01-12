import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
  
	@DataProvider(name = "login")
    public Object[][] dpMethod(){
	 return new Object[][] {{"mngr436014","pYvutyn"},{"mngr436013","pYvutyn"},{"mngr436014","pYvutym"},{"mngr436013","pYvutym"}};
	 }
  
  
	
  
	  @DataProvider(name = "facebook")
	    public  Object[][] dpMethod1(){
		 return new Object[][] {{"Arya","V","abc@gmail.com","1233445"},{"Athira","S","def@gmail.com","123366676"}};
		 }
	  }

	   
  
  

