package com.java.streams;

/**
 *  Finding certain strings with Stream
 */
import java.util.ArrayList;
import java.util.List;
public class StreamExample1_1{ 
   public static void main(String[] args) {    
	List<String> names = new ArrayList<String>();
	names.add("Ajeet");
	names.add("Negan");
	names.add("Aditya");
	names.add("Steve");
	
//	int count1 = 0;
//	for(String s : names) {
//		if(s.length() < 6) {
//			count1++;
//		}
//	}
//	System.out.println(count1);
		
	//Using Stream and Lambda expression
	long count = names.stream().filter(str1->str1.length()<6).count();
	System.out.println("There are "+count+" strings with length less than 6");

   }  
}