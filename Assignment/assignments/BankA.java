package com.lrn.java.Assignment.assignments;

public class BankA extends Bank{
int balance;
	@Override
	public void getBalance() {
				System.out.println("Bank A balance "+balance);				 
	
	}
	public void deposite(int x) {
		balance=x;
	}

}
