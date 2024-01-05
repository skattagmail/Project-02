package com.java.lambda;

interface Addable2{  
    int add(int a,int b);  
}  
  
public class LambdaReturn2 implements Addable2 {  
	
    public int add(int a,int b) {
    	int sum = a +b;
    	return sum;
    }

    public static void main(String[] args) {  
          
    	LambdaReturn2 lr = new LambdaReturn2();
    	System.out.println(lr.add(12, 14));
    }  
}  