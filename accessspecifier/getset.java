package com.lrn.java.accessspecifier;

public class getset {
	private String name;
	private int age;
	private int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>1) {
		this.age = age;
		}
		else {
			System.out.println("enter proper age");
		}
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		if(salary<1) {
		this.salary = salary;
		}
		else {
			System.out.println("enter proper data");
		}
	}
	
}
