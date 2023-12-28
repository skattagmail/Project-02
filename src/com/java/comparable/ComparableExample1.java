package com.java.comparable;

import java.util.*;  
public class ComparableExample1{  
	public static void main(String args[]){  
		ArrayList<Student> al=new ArrayList<Student>();  
		al.add(new Student(101,"Vijay",23));  
		al.add(new Student(106,"Ajay",27));  
		al.add(new Student(105,"Jai",21));  
		  
		Collections.sort(al);  
		for(Student st:al){  
			System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
		
//		int[] arrInt = new int[4];
//		arrInt[0] = 99;
//		arrInt[1] = 82;
//		arrInt[2] = 95;
//		arrInt[3] = 64;
//		
//		Arrays.sort(arrInt);
//		
//		for (int i : arrInt) {
//			System.out.println(i);
//		}
		
	}  
}  