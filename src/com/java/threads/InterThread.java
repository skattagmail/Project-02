package com.java.threads;


class Queue
	{
		int num;
		boolean valueSet = false; //Queue is empty
		public synchronized void put(int num)  {
			while(valueSet) {
				try {
					wait();
				} catch(Exception e) {
			
				}
			}
			System.out.println("Putting the Message number : " + num);
			this.num = num;
			valueSet = true; //Queue has some value
			notify();
		}
		public synchronized void get() 
		{
			while(!valueSet) {
			try {
				wait();
			} catch(Exception e) {
		
			}
			}
			System.out.println("Getting the Message Number : " + num);
			valueSet=false;
			notify();
	
		}
	}

class Producer implements Runnable  //Making this class as Thread
	{
	Queue queue;
	public Producer(Queue queue) 
	{
		this.queue = queue;
		Thread t = new Thread(this,"Producer");
		t.start();
	}
	public void run() 
		{
		int i =1;
			while(i <= 10)
			{
				queue.put(i++);
			}
		}
	}
class Consumer implements Runnable //Making this class as Thread
{
	Queue queue;
	public Consumer(Queue queue) 
	{
		this.queue = queue;
		Thread t = new Thread(this,"Consumer");
		t.start();
	}
	public void run() 
		{
			while(true)
			{
				queue.get();
			}
		}
}

public class InterThread 
{
	public static void main(String[] args) {
		Queue queue = new Queue();
		new Producer(queue);
		new Consumer(queue);

	}
}
