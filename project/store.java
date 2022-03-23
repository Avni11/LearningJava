package com.lrn.project;

public class store {
	public static void main(String[] args) {
		phone p = new phone(10000, 4);
		p.brand = "nokia";
		p.call();
		p.message("hi");
		p.radio();
		smartphone s = new smartphone(50000, 89);
		// passing constructor value
		smartphone s1 = new smartphone(2.5, 7);
		System.out.println(s1.camera);
		s.brand = "realme";
		s.call();
		s.message("hello");
		s.play();
		Redmi r = new Redmi(5668, 8);
		r.brand = "redmi";
		r.call();
		r.selfie();
		r.fold();
	}

}
