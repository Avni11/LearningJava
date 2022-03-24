package com.lrn.java.Assignment.assignments;

public class BankC extends Bank{
	int balance;
	@Override
	public void getBalance() {
				System.out.println("Bank C balance "+balance);				 
	
	}
	public void deposite(int x) {
		balance=x;
	}

}
