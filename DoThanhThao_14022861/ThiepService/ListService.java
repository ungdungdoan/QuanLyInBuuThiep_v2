package ThiepService;

import java.util.ArrayList;

import com.google.gson.Gson;



public class ListService {

    public static String StringListGetByJson(int i)
    
    {
    	
    	String listResturn = null;
    	if(i==1){
        
        ArrayList<Thiepsanpham> thuocList = new ArrayList<Thiepsanpham>();
        try
        {
            thuocList = new ThiepManager().getList();
            Gson gson = new Gson();
            listResturn = gson.toJson(thuocList);
        } catch (Exception e)
        {
            e.printStackTrace();
        }}
        return listResturn;
    }

}
