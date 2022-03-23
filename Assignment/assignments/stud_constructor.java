package com.lrn.java.Assignment.assignments;

public class stud_constructor {
	String name;

	public stud_constructor(String name) {

		this.name = name;
		System.out.println("Student name "+name);
	}

	public stud_constructor() {

		this.name = "unknown";
		System.out.println("student name "+name);
	}
	

}
