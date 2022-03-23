package com.lrn.java.Assignment.assignments;

public class Manager extends Members {
	String dept;

	public Manager(String d,String name, String address, long phone_num, int age, int salary) {
		super(name,address,phone_num,age,salary);
		this.dept=d;
	}
public void specialization() {
		System.out.println("Im a manager");
	}

}
