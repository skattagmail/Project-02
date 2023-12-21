package com.java.threads;

public class ThreadExample1 implements Runnable {
	public void run() {
		for(int i=1; i<=5; i++) {
			if(i %2 == 0) {
				System.out.println(i + " is an even number" + " " + Thread.currentThread().getName());
			} else {
				System.out.println(i + " is an odd number" + " " + Thread.currentThread().getName());
			}
		}
	}
	public static void main(String[] args) {
		ThreadExample1 t1 = new ThreadExample1();
		
		ThreadExample1 t2 = new ThreadExample1();	
		
		Thread th1 = new Thread(t1);
		Thread th2 = new Thread(t2);
		
		th1.start();
		th2.start();
	}

		
}
