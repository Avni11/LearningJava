package com.lrn.java.accessspecifier;

public class Company {
public static void main(String[] args) {
	Company c=new Company();
	getset g=new getset();
	g.setAge(23);
	g.setName("Anitha");
	g.setSalary(278572);
	System.out.println(g.getAge());
	System.out.println(g.getName());
	System.out.println(g.getSalary());
	
}
}
