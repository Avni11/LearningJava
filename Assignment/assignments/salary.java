package com.lrn.java.Assignment.assignments;

public class salary extends company {
//salary s=new salary("ani",003,40000);
	int income;

	salary() {
		super();
	}

	public salary(String empname, int id, int in) {
		super(empname, id);
		this.income = in;
	}

}
