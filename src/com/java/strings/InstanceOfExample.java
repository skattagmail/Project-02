package com.java.strings;

interface Sim{
	void voiceCalling();
	void sendTxtMessages();
}  

class Verizon implements Sim{  
	public void voiceCalling(){
		System.out.println("Calling using Verizon Sim");
	}  
	
	public void sendTxtMessages(){
		System.out.println("Sending Text Messages using Verizon Sim");
	} 
}  

class TMobile implements Sim{  
	public void voiceCalling(){
		System.out.println("Calling using T-Mobile Sim");
	}  
	
	public void sendTxtMessages(){
		System.out.println("Sending Text Messages using T-Mobile Sim");
	} 
}  
  
class Call1{  
	void invoke(Sim p){//upcasting  
		if(p instanceof Verizon){  
			Verizon a=(Verizon)p;//Downcasting   
			a.voiceCalling();  
		}  

		if(p instanceof TMobile){  
			TMobile b=(TMobile)p;//Downcasting   
			b.voiceCalling();  
		}  
	}  
}//end of Call class  
  
public class InstanceOfExample{  
	public static void main(String args[]){  
		Sim p = new TMobile();  
		Call1 c=new Call1();  
		c.invoke(p);  
	}  
}  

