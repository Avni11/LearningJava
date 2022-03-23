package com.lrn.java;

public class Variables {
	static int a=10;//static variable
	int b=20;
	public static void main(String[] args) {
		System.out.println(Variables.a);
		Variables o=new Variables();
		System.out.println(o.b);
		//decision making statments
		int money=20000;
		if(money<10000)
		{
			System.out.println("trip cancel");
		}
		
		int x=89,y=20;
		if(x<y) {
			System.out.println("x is less");
		}
		else {
			System.out.println("y is less");
		}
		
		if(money<20000 && money>10000)
		{
			System.out.println("trip to goa");
		}
		else if(money<15000 && money>100000)
		{
			System.out.println("concert");
		}
		else {
			System.out.println(money);
		}
	
	}

}
