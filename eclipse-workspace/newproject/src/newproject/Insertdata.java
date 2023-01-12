package newproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class Insertdata {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String employee_name = null;
		String employee_id =null;
		String employee_designation = null;
		 String myDriver = "com.mysql.jdbc.Driver";
		  String myUrl = "jdbc:mysql://localhost/anjana_batch_database";
		  try {
		  Class.forName(myDriver);
		  Connection conn = DriverManager.getConnection(myUrl, "root", "");
		  String sql = " insert into employees2 (employee_name, employee_id, employee_designation)"
				    + " values (?, ?, ?)";
		  PreparedStatement preparedStmt = conn.prepareStatement(sql);
		  preparedStmt.setString (1, "Anju");
		  preparedStmt.setInt (2, 143);
		  preparedStmt.setString (3, "Tester");
		  
		  preparedStmt.executeUpdate();
		  
		  conn.close();
		  } catch (ClassNotFoundException e) {
				System.out.println("Class Not found Exception cought");
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {

				System.out.println("Database Updated Successfully");
				System.out.println("Disconnected from database");
	}
	}
}
