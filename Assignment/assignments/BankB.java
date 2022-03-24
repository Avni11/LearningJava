package com.lrn.java.Assignment.assignments;

public class BankB extends Bank{
	int balance;
	@Override
	public void getBalance() {
				System.out.println("Bank B balance "+balance);				 
	
	}
	public void deposite(int x) {
		balance=x;
	}

}
