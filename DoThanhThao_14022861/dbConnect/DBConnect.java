package dbConnect;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	private static Connection conn;
	 private static String DRIVER = "com.mysql.jdbc.Driver";
	 private static String URL = "jdbc:mysql://localhost:3306/QLBT";
	 private static String USER = "root";
	 private static String PASS = "";
	 
	 public static Connection getConnection(){
	  try {
	   Class.forName(DRIVER);
	   conn = DriverManager.getConnection(URL,USER,PASS);
	  } catch (Exception e) {
	   System.out.println(e);
	  }
	  return conn;
	 }
}
