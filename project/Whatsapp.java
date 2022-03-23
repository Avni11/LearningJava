package com.lrn.project;

public class Whatsapp extends Admin {

	public Whatsapp(String name, long num) {
		super(name, num);
	}
	public static void main(String[] args) {
		User u=new Admin("ani",68684564);
		u.chat();
		Admin a=(Admin) u;
		a.chat();
		a.add("pavi");
		
	}

}
