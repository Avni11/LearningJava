package com.lrn.abstrac.example;

public class Dog extends Pets {

	@Override
	void food() {
		System.out.println("meat and milk");
		
	}

	@Override
	void sound() {
	System.out.println("bow bow");
	}

	@Override
	void play() {
		System.out.println("jumping");
		
	}

}
