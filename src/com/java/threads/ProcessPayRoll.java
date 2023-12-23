package com.java.threads;

public class ProcessPayRoll implements Runnable{
	private String name;
	public ProcessPayRoll(String name) {
		this.name = name;
	}
	
	public void run() {
		System.out.println("Start Thread : " + name);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Ended Thread : " + name);
	}

}
