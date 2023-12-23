package com.java.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
	
	public static void main(String[] args) {
			
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		for(int i=1;i<=10;i++) {
			ProcessPayRoll processObj = new ProcessPayRoll("My Task " + i);
			executorService.execute(processObj);
		}
		
		executorService.shutdown();
		while(!executorService.isTerminated()) {
//			try {
//				executorService.awaitTermination(20, TimeUnit.SECONDS);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
		System.out.println("All Threads completed Successfully");
		
	}

}
