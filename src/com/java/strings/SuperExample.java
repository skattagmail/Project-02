package com.java.strings;

public class SuperExample {
	public static void main(String args[]){  
		Dog d=new Dog();  
		d.printColor();  
	}
}

class Animal{  
	String color="white";  
	
	public void test() {
		System.out.println("Super Class Test Method");
	}
}  

class Dog extends Animal{  
	String color="black";  
	
	void printColor(){  
		System.out.println(color);//prints color of Dog class  
		System.out.println(super.color);//prints color of Animal class 
		super.test();
	}  
}  