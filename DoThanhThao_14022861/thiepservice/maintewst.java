package thiepservice;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import thiepservice.ListServiceStub.StringListGetByJson;
import thiepservice.ListServiceStub.StringListGetByJsonResponse;

public class maintewst {

	public static void main(String[] args) throws RemoteException {
		ListServiceStub stub = new ListServiceStub();
		StringListGetByJson get = new StringListGetByJson();
		get.setI(1);
		StringListGetByJsonResponse vn = new StringListGetByJsonResponse();
				
				String s = stub.stringListGetByJson(get).get_return();
				System.out.println(s);
	}

}
