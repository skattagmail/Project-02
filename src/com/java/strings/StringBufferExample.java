package com.java.strings;

public class StringBufferExample {
	public static void main(String[] args) {
		StringBuilder s1 = new StringBuilder("Srinivas");
		System.out.println(s1);
		s1.append(" Katta");
		System.out.println(s1);
		s1.insert(0, "Welcome");
		System.out.println(s1);

	}
}
