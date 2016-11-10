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