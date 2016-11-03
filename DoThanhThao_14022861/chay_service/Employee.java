package com.testdb.ws;

public class Employee implements java.io.Serializable{
	 String Id;
	 String ho;
	 String ten;
	 String diachi;
	 public Employee(){
		 
	 }
	 public Employee(String id, String ho, String ten, String diachi){
		 this.Id = id;
		 this.ho = ho;
		 this.ten = ten;
		 this.diachi = diachi;
	 }
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", ho=" + ho + ", ten=" + ten
				+ ", diachi=" + diachi + ", toString()=" + super.toString()
				+ "]";
	}
	 
}