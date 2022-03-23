package com.lrn.java.Assignment.assignments;
import java.util.Scanner;
import java.lang.Math;
public class Series {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter value for a");
	int a=s.nextInt();
	System.out.println("enter value for b");
	int b=s.nextInt();
	System.out.println("enter value for c");
	int c=s.nextInt();
int res=a;
	for(int i=0;i<c;i++)
	{
		res+=Math.pow(2, i)*b;
	System.out.print(res+",");
	}
}
}
