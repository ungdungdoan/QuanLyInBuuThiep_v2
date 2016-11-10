package FormThiep;

import java.lang.reflect.Type;
import java.rmi.RemoteException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.apache.axis2.AxisFault;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import thiepservice.ListServiceStub;
import thiepservice.ListServiceStub.StringListGetByJson;
import thiepservice.ListServiceStub.StringListGetByJsonResponse;





public class ThiepManager {
	 public List<Thiepsanpham> getAllThuoc() throws RemoteException {
	    	ListServiceStub stub = new ListServiceStub();
			StringListGetByJson ss = new StringListGetByJson();
			ss.setI(1);
			StringListGetByJsonResponse cc =stub.stringListGetByJson(ss);
			String ee =cc.get_return();
			Gson gson = new Gson();
			Type type = new TypeToken<ArrayList<Thiepsanpham>>(){}.getType();
			 List<Thiepsanpham> danhsachThiep = gson.fromJson(ee, type); 
			 return danhsachThiep;
	    }
	  
	}


