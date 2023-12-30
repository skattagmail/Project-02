package com.java.iostreams;

import java.io.*;  
class SequenceInputStreamExample {    
	  public static void main(String args[])throws Exception{    
		   FileInputStream input1=new FileInputStream("C:\\Users\\skatt\\17Aug23\\file1.txt");    
		   FileInputStream input2=new FileInputStream("C:\\Users\\skatt\\17Aug23\\file3.txt");  
		   
		   SequenceInputStream inst=new SequenceInputStream(input1, input2);    
		   int j;    
		   while((j=inst.read())!=-1){    
		    System.out.print((char)j);    
		   }    
		   inst.close();    
		   input1.close();    
		   input2.close();    
	  }    
}    