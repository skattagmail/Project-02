package com.java.collections;

import java.util.HashSet;
public class TestHashSet {
   public static void main(String args[]) {
      // HashSet declaration
      HashSet<String> hset = new HashSet<String>();
      
      HashSet hset1 = new HashSet(10,8);  //Initial Capacity and Load factor
      
        // Adding elements to the HashSet
      hset.add("Apple");
      hset.add("Mango");
      hset.add("Grapes");
      hset.add("Orange");
      hset.add("Fig");
      //Addition of duplicate elements
      hset.add("Apple");
      hset.add("Mango");
      //Addition of null values
      hset.add(null);
      hset.add(null);
      hset.add("");
      hset.add("");

      //Displaying HashSet elements
      System.out.println(hset);
    }
}
