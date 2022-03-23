package com.lrn.java;

public class Switch {
	public static void main(String[] args) {
		char mnp = 'a';
		switch (mnp) {
		case 'a':
			System.out.println("delhi");
			break;
		case 'b':
			System.out.println("goa");
			break;
		case 'c':
			System.out.println("bang");
			break;
		case 'd':
			System.out.println("kerala");
			break;
		default:
			System.out.println("tamilnadu");
		}
		int x=10;
		if(x%2==0) {
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
	}

}
