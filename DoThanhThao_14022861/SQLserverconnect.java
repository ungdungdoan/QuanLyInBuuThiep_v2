package cosodulieu.tutorial.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLserverconnect {
	 public static Connection getSQLServerConnection()
	         throws SQLException, ClassNotFoundException {
	     String hostName = "localhost";
	     String sqlInstanceName = "DELL/SQLEXPRESS";
	     String database = "cungcapbuuthiep";
	     String userName = "sa";
	     String password = "0968661792Aa";
	 
	     return getSQLServerConnection(hostName, sqlInstanceName, database,
	             userName, password);
	 }
	 

	 public static Connection getSQLServerConnection(String hostName,
	         String sqlInstanceName, String database, String userName,
	         String password) throws ClassNotFoundException, SQLException {
	     
	     Class.forName("net.sourceforge.jtds.jdbc.Driver");
	 
	
	     String connectionURL = "jdbc:jtds:sqlserver://" + hostName + ":1433/"
	             + database + ";instance=" + sqlInstanceName;
	 
	     Connection conn = DriverManager.getConnection(connectionURL, userName,
	             password);
	     return conn;
	 }
	 
	}


