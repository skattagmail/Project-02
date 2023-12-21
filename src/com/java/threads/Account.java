package com.java.threads;

public class Account {
	
	private int balance = 6000;

	
	public int withDraw(int amount) {
		balance = balance-amount;
		return balance;
	}
	
	public int getBalance() {
		return balance;
	}
	
} 
