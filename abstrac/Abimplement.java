package com.lrn.abstrac;

public class Abimplement extends Ab1{
	int a;
	
	Abimplement(int a){
		super(a);
	}
	@Override
	void meth() {
		System.out.println("I'm implementing ab1");
	}	

}
