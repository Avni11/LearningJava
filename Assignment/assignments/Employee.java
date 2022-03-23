package com.lrn.java.Assignment.assignments;

public class Employee extends Members {
	String dept;

	public Employee(String d,String name, String address, long phone_num, int age, int salary) {
		super(name,address,phone_num,age,salary);
		this.dept=d;
	}

	public void specialization() {
		System.out.println("im an employee");
	}
	

}
