package com.java.exceptions;

//User Defined Exception
public class InsufficientFundsException extends Exception {
	private double amount;
	
	public InsufficientFundsException(double amount) {
	   this.amount = amount;
	}
	public InsufficientFundsException() {
		  System.out.println("Withdraw failed");
	}
	
	public double getAmount() {
	   return amount;
	}
	
	public void getMessage(String msg) {
		System.out.println(msg);
	}
}
