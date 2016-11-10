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