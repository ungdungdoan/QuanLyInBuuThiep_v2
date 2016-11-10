package ManagerSql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import dbConnect.DBConnect;

public class Manager {
	public static Connection con;
	public Manager(){
		DBConnect db = new DBConnect();
		this.con = db.getConnection();
	}
	public void addThiep(int makh,String tenkh,int mabt,String sodienthoai, String gmail, String diachi, String yeucau) throws SQLException{
		String sql = "INSERT INTO SANPHAM (makh,tenkh,mabt,sodienthoai,gmail,diachi,yeucau) VALUES (?, ?, ?, ?, ?, ?, ?)";
		 
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setInt(1, makh);
		statement.setString(2, tenkh);
		statement.setInt(3, mabt);
		statement.setString(4, sodienthoai);
		statement.setString(5, gmail);
		statement.setString(6, diachi);
		statement.setString(7, yeucau);
		
		int rowsInserted = statement.executeUpdate();
		if (rowsInserted > 0) {
		    System.out.println("A new user was inserted successfully!");
		
	}
		System.out.println("them thnah cong");
		detroy();
	}
public void updateThiep(int makh,String tenkh,int mabt,String sodienthoai, String gmail, String diachi, String yeucau) throws SQLException{
	String sql = "UPDATE SANPHAM SET tenkh=?, mabt=?,sodienthoai=?, gmail=?, diachi=?, yeucau=? WHERE makh=?";
	PreparedStatement statement = con.prepareStatement(sql);
	statement.setString(1, tenkh);
	statement.setInt(2, mabt);
	statement.setString(3, sodienthoai);
	statement.setString(4, gmail);
	statement.setString(5, diachi);
	statement.setString(6, yeucau);
	statement.setInt(7, makh);
	int rowsInserted = statement.executeUpdate();
	if (rowsInserted > 0) {
	    System.out.println("A new user was inserted successfully!");
	
}
	System.out.println("them thnah cong");
	detroy();
}
public void deleteThiep(int makh) throws SQLException{
	String sql = "DELETE FROM SANPHAM WHERE makh=?";
	PreparedStatement statement = con.prepareStatement(sql);
	statement.setInt(1, makh);
	int rowsInserted = statement.executeUpdate();
	if (rowsInserted > 0) {
	    System.out.println("A new user was inserted successfully!");
	
}
	System.out.println("them thanh cong");
	detroy();
}	
	public static void detroy() throws SQLException{
		con.close();
	}

	
	
}
