package cosodulieu.tutorial.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ketnoidatabase {
	private Connection conn;
	public ketnoidatabase() throws ClassNotFoundException, SQLException {
	
	Class.forName("com.microsoft.sqlserver.jdbc.sqlserverdriver");
	String url ="={SQLServer};Server=DELL/SQLEXPRESS;Database=cungcapbuuthiep;"
			+ "UserName=sa;"
			+ "Password=0968661792Aa";
	this.conn=DriverManager.getConnection(url);
	
	}
	public ResultSet GetData(String tbName) throws SQLException{
		ResultSet kq=null;
		Statement statement= (Statement) this.conn.createStatement();
		String sql="cungcapbuuthiep";
		kq= statement.executeQuery(sql);
		return kq;
		
	}
	public void Close() throws SQLException{
		if(this.conn!= null)
			this.conn.close();
		
	}
	public static void main(String[] args) throws  ClassNotFoundException,SQLException{
	 
		 ConnectionUtils pt= new  ConnectionUtils();
		 ResultSet rs= pt.GetData("cungcapbuuthiep");
		 while(rs.next()){
			 System.out.println(rs.getString("hangsanxuat"));
		 }
	}
}
