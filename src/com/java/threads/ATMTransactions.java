package com.java.threads;

public class ATMTransactions {
	public static void main(String[] args) {
			Account account = new Account();
		
			AccountHolder accountHolder = new AccountHolder(account, 1000);
		
			Thread te1 = new Thread(accountHolder);
			Thread te2 = new Thread(accountHolder);
		
			te1.setName("Self");
			te2.setName("Partner");
		
			te1.start();
			te2.start();
			
		}
}
	


