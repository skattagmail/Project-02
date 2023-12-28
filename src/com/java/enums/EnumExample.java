package com.java.enums;

public class EnumExample {
	//defining the enum inside the class  
	public enum Season { WINTER, SPRING, SUMMER, FALL }  
		//main method  
		public static void main(String[] args) {  
			//traversing the enum  
			for (Season s : Season.values())  //Advanced For Loop
				System.out.println(s);  
		}
}  