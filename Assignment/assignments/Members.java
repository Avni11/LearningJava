package com.lrn.java.Assignment.assignments;

public class Members {
String name,address;
long phone_num;
int age,salary;
Members(){
	
}
public Members(String name, String address, long phone_num, int age, int salary) {
	this.name = name;
	this.address = address;
	this.phone_num = phone_num;
	this.age = age;
	this.salary = salary;
}

public void printsalary() {
	System.out.println("salary="+salary);
}
}
