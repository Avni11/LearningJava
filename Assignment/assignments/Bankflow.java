package com.lrn.java.Assignment.assignments;

public class Bankflow {
	public static void main(String[] args) {
	BankA a=new BankA();
	a.deposite(100);
	a.getBalance();
	BankB b=new BankB();
	b.deposite(150);
	b.getBalance();
	BankC c=new BankC();
	c.deposite(200);
	c.getBalance();
	}

}
