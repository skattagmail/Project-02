package com.java.threads;

public class Account {
	
	int balance = 6000;
	int accountNum;
	static String bankName="Chase";

	
	public int withDraw(int amount) {
		balance = balance-amount;
		return balance;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public static void testMethod() {
		System.out.println("Static Method in Account Class");
	}
} 
