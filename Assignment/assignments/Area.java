package com.lrn.java.Assignment.assignments;

public class Area extends Shape{

	@Override
	public int rectanglearea(int a, int b) {
		
		return a*b;
	}

	@Override
	public int squarearea(int a) {
		// TODO Auto-generated method stub
		return a*a;
	}

	@Override
	public double circlearea(int a) {
		return 3.14*a*a;
	}
	public static void main(String[] args) {
		Area a=new Area();
		System.out.println(a.rectanglearea(23, 10));
		System.out.println(a.squarearea(22));
		System.out.println(a.circlearea(25));
		
	}

}
