package com.lrn.abstrac.interfac;

public class Casio implements Calc {

	@Override
	public void add(int a, int b) {
		System.out.println(a+b);
	}

	@Override
	public void sub(int a, int b) {
System.out.println(a-b);
		
	}

	@Override
	public void multiply(int a, int b) {
		System.out.println(a*b);
		
	}

	@Override
	public void div(int a, int b) {
		System.out.println(a/b);
		
	}
	public static void main(String[] args) {
		Calc c=new Casio();
		c.add(89, 780);
		c.sub(45,32);
		c.multiply(23, 10);
		c.div(44, 4);
	}

}
