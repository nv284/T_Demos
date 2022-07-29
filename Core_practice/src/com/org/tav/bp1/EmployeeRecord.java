package com.org.tav.bp1;

public class EmployeeRecord implements Prototype {

	private int id ; 
	private String name , designation ;
	private double salary ;
	private String address;
	
	
	
	public EmployeeRecord() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Employee records ");
		System.out.println("id "+"\n"+"Name ");
	}



	public EmployeeRecord(int id, String name, String designation, double salary, String address) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.address = address;
	}

public void shwoRecord() {
	System.out.println(id+"   "+name+"   "+salary+"   "+address);
}

	@Override
	public Prototype getClone() {
		// TODO Auto-generated method stub
		return new EmployeeRecord(id, name, designation, salary, address);
	}

}
