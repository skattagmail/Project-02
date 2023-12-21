package com.java.threads;

public class ThreadPriority extends Thread{ 
	    public void run()  
	    {    
	        System.out.println("Running thread is: " + Thread.currentThread().getName() + " and Priority of thread is: "+Thread.currentThread().getPriority());    
	    }    
	    public static void main(String args[])  
	    {    
	        // creating one thread    
	    	ThreadPriority t1=new ThreadPriority();   
	    	ThreadPriority t2=new ThreadPriority();
	    	ThreadPriority t3=new ThreadPriority();
	    	
	    	ThreadPriority t4=new ThreadPriority();   
	    	ThreadPriority t5=new ThreadPriority();
	    	ThreadPriority t6=new ThreadPriority();
	    	
	    	
	        // print the maximum priority of this thread  
	        t1.setPriority(Thread.MAX_PRIORITY);  //10
	        t2.setPriority(Thread.MIN_PRIORITY); //1
	        t3.setPriority(Thread.NORM_PRIORITY); //5
	        
	        t4.setPriority(3);
	        t5.setPriority(6);
	        t6.setPriority(9);
	        
	        // call the run() method  
	        t1.start();  
	        t2.start();
	        t3.start();
	        
	        t4.start();
	        t5.start();
	        t6.start();
	    }    
}
