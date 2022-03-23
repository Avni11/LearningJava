package com.lrn.java;
//method over loading 
public class function {
	static int multi(int x,int y) {
		return(x*y);
	}

	static float multi(float x,float y) {//different type args
		return(x*y);
	}
	static void multi(float x,float y,int z) {//different count args
		System.out.println(x*y*z);
	}
	static float multi(float x,int y,float z) {//different sequence
		return(x*y*z);
	}

	public static void main(String[] args) {
		
		System.out.println(function.multi(20,34));
		System.out.println(function.multi(25,3));
		System.out.println(function.multi(2.5f, 5.6f));
		function.multi(2.5f, 5.6f,7);
		System.out.println(function.multi(2.5f,7, 5.6f));

		}

}
