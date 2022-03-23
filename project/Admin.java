package com.lrn.project;

public class Admin extends User {
	public Admin(String name,long num) {
		super(name,num);
	}
	public void add(String name) {
		System.out.println(name+"Adding");
	}
	public void remove(String name) {
		System.out.println("removed"+name);
	}

}
