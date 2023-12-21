package com.java.threads;

public class ThreadExample extends Thread {
	//Thread extends Object implements Runnable
	public void run() { //Running
		for(int i=1; i<=5; i++) {
			try {
				Thread.sleep(2000); //Non-Runnable
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i %2 == 0) {
				System.out.println(i + " is an even number" + " " + Thread.currentThread().getName());
			} else {
				System.out.println(i + " is an odd number" + " " + Thread.currentThread().getName());
			}
		}
	} //Terminated or Dead
	
	public static void main(String[] args) {
		ThreadExample t1 = new ThreadExample(); //New
		
		ThreadExample t2 = new ThreadExample();
		
		t1.setName("Reader Thread");
		t2.setName("Writer Thread");
		t1.start(); //Runnable
		t2.start();
	}
}
