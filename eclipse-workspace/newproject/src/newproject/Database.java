package newproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class Database {

	public static void main(String[] args) throws ClassNotFoundException, SQLException  {
		//"jdbc:mysql://ipaddress:portnumber/db_name"
		 String dbUrl = "jdbc:mysql://localhost:3306/anjana_batch_database";
		 String username = "root";
		 String password = "";
		 String query = "select *  from workers;";
		 Class.forName("com.mysql.jdbc.Driver");
		
		
			Connection con = DriverManager.getConnection(  dbUrl,username,password);
		
		Statement stmt =   con.createStatement();	
		ResultSet rs= stmt.executeQuery(query);	
		System.out.println("Connected");
		while (rs.next()){
    		String myName = rs.getString(1);								        
            String myAge = rs.getString(2);	
            String myAge1 = rs.getString(3);	
            System. out.println(myName+"  "+myAge+" "+myAge1);		
    }		
	 // closing DB Connection		
	con.close();			
		

	}

}
