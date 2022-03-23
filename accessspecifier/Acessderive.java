package com.lrn.java.accessspecifier;

public class Acessderive extends AccessSpecifier {
	public static void main(String[] args) {
		Acessderive ac=new Acessderive();
		System.out.println(ac.a);
		System.out.println(ac.d);
		System.out.println(ac.b);
		ac.pub();
		ac.pro();
		ac.defau();
	}

}
