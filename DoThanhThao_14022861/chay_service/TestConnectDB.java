package com.testdb.ws;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;

import com.google.gson.Gson;
public class TestConnectDB {
	
  public static ArrayList<Employee> dbConnect(String db_connect_string,String db_userid,String db_password){
 	   ArrayList<Employee> lstEmployees = new ArrayList <Employee>();
       try {
          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
          Connection conn = DriverManager.getConnection(db_connect_string,db_userid, db_password);
          System.out.println("connected");
          Statement statement = conn.createStatement();
          String queryString = "select * from nhanvien";
          ResultSet rs = statement.executeQuery(queryString);
          while (rs.next()) {
             //System.out.println(rs.getString(1));
             lstEmployees.add(new Employee(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)));
          }
       } catch (Exception e) {
          e.printStackTrace();
       }
       return lstEmployees;
    }

   /* public static void main(String[] args)
    {
    	ArrayList<Employee> listEmployees = dbConnect("jdbc:sqlserver://localhost;databaseName=sample", "sa", "123456");
    	for (Employee emp : listEmployees){
    		System.out.println(emp);
    	}
    }*/
}
