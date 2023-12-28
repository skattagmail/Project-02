package com.java.threads;

public class MainApp {
	
	public MainApp() {
		Account.testMethod();
	}
	public static void main(String[] args) {
		Account acc1 = new Account();
		acc1.balance = 250;
		acc1.accountNum = 12345;
		
		Account acc2 = new Account();
		acc1.balance = 1250;
		acc1.accountNum = 232312345;	
		
		
//		Account.bankName = "BOA";
		
		System.out.println("Account 1 Details");
		
		System.out.println(acc1.balance + "   " + acc1.accountNum + " " + Account.bankName);
		
		System.out.println("Account 2 Details");

		System.out.println(acc2.balance + "   " + acc2.accountNum + " " + Account.bankName);

//		Account.testMethod();
		
		MainApp ma = new MainApp();
		
	}
}
