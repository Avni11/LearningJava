package com.lrn.java;

public class Even {
	static void examp(int a,int b) {
		System.out.println("done");
	}
	public static void main(String[] args) {

		for (int x = 1; x < 10; x++) {
			if (x % 2 != 0) {
				System.out.println(x);
			}
		}
		int y = 1;
		while (y < 10) {
			if (y % 2 != 0) {
				System.out.println(y);

			}
			y++;
		}

	}

}
