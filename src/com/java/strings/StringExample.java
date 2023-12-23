package com.java.strings;

public class StringExample {
	public static void main(String[] args) {
		String s1 = "Srinivas";
		
//		s1 = "Welcome Srinivas";
//		
//		s1 = "Srinivas Katta";
//		System.gc();
//		
		String s2 = "Welcome Srinivas";
		System.out.println(s2.substring(6));
		System.out.println(s2.substring(6,10));

		
		String s3 = new String("Srinivas");
		
		System.out.println("s1 equals s3: " + (s1.equals(s3)));
		System.out.println("s1 == s3: " + (s1 == s3));

	}
}
