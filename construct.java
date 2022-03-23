package com.lrn.java;

public class construct {
	construct() {
		System.out.println("from constructor");
	}

	public static void main(String[] args) {
		construct c = new construct();
		int x = 200;
		Even a = new Even();
		function f = new function();
		System.out.println(f.multi(2, 3));
	}
}
