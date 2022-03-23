package com.lrn.java.Assignment.assignments;
import java.util.Scanner;

public class Odd {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number");
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}

}
