package com.lrn.java;

public class Owner {
public static void main(String[] args) {
	Audi a=new Audi();
	ferrari f=new ferrari();
	a.drive();
	a.brake();
	a.sound();
	System.out.println("ferrari");
	f.drive();
	f.brake();
	f.sound();
}
}
