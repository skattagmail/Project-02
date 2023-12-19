package com.java.abstraction;

public abstract class FedBank {
	
	//Concrete Methods
	public void checkEligibility() {
		System.out.println("The Customer should have Valid Residential Status");
	}
	
	// Non-concrete methods or Abstract methods
	abstract void maintainMinBalance();
	
	abstract void provideNetBanking();

}
