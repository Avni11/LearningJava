package com.lrn.java.Assignment.assignments;

public class expense extends salary {
	int budget;

	public expense(String a, int id, int in) {
		super(a, id, in);
		this.budget = 15000;

	}

	public static void main(String[] args) {
		expense e = new expense("ani", 03, 40000);
		System.out.println("employee name " + e.empname);
		System.out.println("employee id " + e.id);
		System.out.println("employee income " + e.income);
		System.out.println("budget amount=" + e.budget);
		int s1 = e.income - e.budget;
		System.out.println("remaing amount=" + s1);
		System.out.println((s1 < 10000) ? "reduce expense" : "fine expense");
	}
}
