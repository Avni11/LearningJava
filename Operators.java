package com.lrn.java;

public class Operators {
public static void main(String[] args) {
	int a=11;
	System.out.println(++a);
	System.out.println(a++);
	System.out.println(a--);
	System.out.println(--a);
	float b=12.3f;
	System.out.println(a+b);
	System.out.println(a-b);
	System.out.println(a*b);
	System.out.println(a/b);
	System.out.println(a%b);
	
	System.out.println("===relational==");
	System.out.println(a<b);
	System.out.println(a>b);
	b=11.0f;
	System.out.println(a<=b);
	System.out.println(a>=b);
	System.out.println(a==b);
	
	System.out.println("==logical==");
	
	int c=25;
	System.out.println(a<b && a<c);
	System.out.println(c>b || c>a);
	
	System.out.println("==excersise==");
	System.out.println(a>b && ++c>b);
	System.out.println(a++<b || ++c<b);
	System.out.println(a++<b || ++c<b++);
	System.out.println(c);
	System.out.println(a);
	System.out.println(b);
	
	System.out.println("==bitwise==");
	System.out.println(10&2);
	System.out.println(10|4);
	
	
}
}
