package com.java.interfaces;

public class BOA implements FederalBank {
	public void checkEligibility() {
		System.out.println("The customer should be Valid Resident");
	}
	
	public void maintainMinBalance() {
		System.out.println("The Minimum Balance is 10 USD");
	}
	
	public void provideNetBanking() {
		System.out.println("Every Customer can login from their devices");
	}
	public void provideEduLoans() {
		System.out.println("Providing Educational Loans up to 100k");
	}
}
