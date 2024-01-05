package com.java.lambda;

// Java Lambda Expression Example: No Parameter
interface Sayable{  
    public String say();  
}  

public class LambdaExpressionExample1{  
	public static void main(String[] args) {  
	    Sayable s=()->{  
	        return "Java Lambda Expression Example: No Parameter";  
	    };  
	    System.out.println(s.say());  
	}  
}  

//public class LambdaExpressionExample1 implements Sayable{  
//	public String say() {
//		return "Java Lambda Expression Example: No Parameter";  
//	}
//	
//	public static void main(String[] args) {  
//	    Sayable s= new  LambdaExpressionExample1();
//	    System.out.println(s.say());  
//	}  
//}  