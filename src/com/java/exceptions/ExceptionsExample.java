package com.java.exceptions;

public class ExceptionsExample {
	public static void main(String[] args) {
		int num1 = 20;
		int num2 = 0;
		
		System.out.println("Addition: " + (num1 + num2));
		
		// Unchecked Exception
		try {
			System.out.println("Division: " + (num1 / num2));
		} catch(ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("Catch Block1");
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Catch Block2");

		}
		System.out.println("Subtraction: " + (num1 - num2));
		System.out.println("Multiplication: " + (num1 * num2));	
	}
}
