package com.lrn.project;

public class Child extends Parent {
	int z, a, b, c, d;

	public Child(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	public Child(int x, int y, int z, int a, int b) {
		this(x, y, z);
		this.a = a;
		this.b = b;

	}

	public Child(int x, int y, int z, int a, int b, int c, int d) {
		this(x, y, z, a, b);
		this.c = c;
		this.d = d;
	}
	public static void main(String[] args) {
		Child n=new Child(56,78,90,34,70);
		System.out.println(n.x);
		System.out.println(n.y);
		System.out.println(n.z);
		System.out.println(n.a);
		System.out.println(n.b);

	}

}
