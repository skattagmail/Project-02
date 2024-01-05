package com.java.lambda;

import java.util.*;  
public class LambdaForEach{  
    public static void main(String[] args) {  
          
        List<String> list=new ArrayList<String>();  
        list.add("ankit");  
        list.add("mayank");  
        list.add("irfan");  
        list.add("jai");  
          
        list.forEach(  
            (n)->System.out.println(n)  
        );  
        
        for (String n: list) {
        	System.out.println(n);
        }
    }  
}  