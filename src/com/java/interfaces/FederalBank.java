package com.java.interfaces;

public interface FederalBank {
	String location = ""; //public static final String location = ""
	String type = "";

	void checkEligibility(); // public abstract void checkEligibility();
	
	void maintainMinBalance();
	
	void provideNetBanking();
	
	default void provideEduLoans() {
		System.out.println("Providing Educational Loans");
	}
}
