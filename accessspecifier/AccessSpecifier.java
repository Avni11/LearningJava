package com.lrn.java.accessspecifier;

public class AccessSpecifier {
	int a=25;
	public int b=9;
	private int c=78;
	protected int d=45;
	public void pub() {
		System.out.println("Im a public method");
	}
	protected  void pro() {
		System.out.println("Im a rotected method");
	}
	private void pri() {
		System.out.println("Im a private method");
	}
	void defau() {
		System.out.println("IM a default method");
	}
	public static void main(String[] args) {
		AccessSpecifier a=new AccessSpecifier();
		System.out.println(a.a+a.b+a.c+a.d);
		a.pri();
		a.pro();
		a.pub();
		a.defau();
	}
}
