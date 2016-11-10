package ThiepService;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.google.gson.Gson;



public class GetThiepList {  
	private static Connection conn;
	 private static String DRIVER = "com.mysql.jdbc.Driver";
	 private static String URL = "jdbc:mysql://localhost:3306/qlbt";
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
	

public ArrayList<Thiepsanpham> getList() throws SQLException 
{	GetThiepList conn = new GetThiepList();
    ArrayList<Thiepsanpham> donationList = new ArrayList<Thiepsanpham>();
    Connection con = conn.getConnection();
    PreparedStatement stmt = con.prepareStatement("SELECT * FROM SANPHAM");

        ResultSet rs = stmt.executeQuery();
        //System.out.println(rs);
        try
        {
            while(rs.next())
            {
            	Thiepsanpham ThiepObj = new Thiepsanpham();
                ThiepObj.setMakh(rs.getInt("makh"));
                ThiepObj.setTenkh(rs.getString("tenkh"));
                ThiepObj.setMabt(rs.getInt("mabt"));
                ThiepObj.setSodienthoai(rs.getString("sodienthoai"));
                ThiepObj.setGmail(rs.getString("gmail"));
                ThiepObj.setDiachi(rs.getString("diachi"));
                ThiepObj.setYeucau(rs.getString("yeucau"));
                donationList.add(ThiepObj);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        return donationList;     
    }
public static String StringListGetByJson(int i)

{
	
	String listResturn = null;
	if(i==1){
    
    ArrayList<Thiepsanpham> ThiepList = new ArrayList<Thiepsanpham>();
    try
    {
        ThiepList = new ThiepManager().getList();
        Gson gson = new Gson();
        listResturn = gson.toJson(ThiepList);
    } catch (Exception e)
    {
        e.printStackTrace();
    }}
    return listResturn;
}
}