package com.java.threads;

public class AccountHolder implements Runnable {
	
	private Account account;
	
	int withDrawAmount;
	
	public AccountHolder (Account account, int amount) {
		this.account = account;
		this.withDrawAmount = amount;
	}
	
	public synchronized void makeWithdrawal(int withDrawAmount) {
		if (account.getBalance()>= withDrawAmount) {
			System.out.println("==================");
			account.withDraw(withDrawAmount);
			System.out.println("Amount " + withDrawAmount + " is sucessfully withdraw by " + Thread.currentThread().getName());			
		} else {
			 System.out.println("You do not have enough balance in account to withdraw this amount");
		}
		System.out.println("Your new balance is " +account.getBalance());	
	}

	
		public void run() {
			for (int i=1; i<=10; i++) {
				if (account.getBalance()<= 0) {
					System.out.println("Your account is overdrawan"); 
				} else {
					makeWithdrawal(withDrawAmount);
				}
			}
		}
	}
