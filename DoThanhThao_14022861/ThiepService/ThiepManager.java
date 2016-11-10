package ThiepService;

import java.sql.Connection;
import java.util.ArrayList;

import dbConnect.DBConnect;

public class ThiepManager {
	  public ArrayList<Thiepsanpham> getList() throws Exception
	    {
	        ArrayList<Thiepsanpham> courseList = new ArrayList<Thiepsanpham>();
	        DBConnect db = new DBConnect();
	        Connection con = db.getConnection();
	       GetThiepList list = new GetThiepList();
	        courseList = list.getList();
	        return courseList;
	    }

}
