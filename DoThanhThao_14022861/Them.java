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