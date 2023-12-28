package com.java.enums;


//enum outside the class
enum Season { WINTER, SPRING, SUMMER, FALL }  

class EnumOutsideClass{  
	public static void main(String[] args) {  
		Season s = Season.WINTER;  
		System.out.println(s);  
	}
}   