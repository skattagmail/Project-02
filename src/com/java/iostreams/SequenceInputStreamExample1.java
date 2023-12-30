package com.java.iostreams;

import java.io.*;   
// reads the data from two files and writes into another file
class SequenceInputStreamExample1{    
  public static void main(String args[])throws Exception{    
	   FileInputStream fin1=new FileInputStream("C:\\\\Users\\\\skatt\\\\files\\\\fileout2.txt");    
	   FileInputStream fin2=new FileInputStream("C:\\\\Users\\\\skatt\\\\files\\\\bufout1.txt");    
	   
	   FileOutputStream fout=new FileOutputStream("C:\\\\Users\\\\skatt\\\\files\\\\seqinfile1.txt");      
	   SequenceInputStream sis=new SequenceInputStream(fin1,fin2);    
	   int i;    
	   while((i=sis.read())!=-1)    
	   {    
	     fout.write(i);        
	   }    
	   sis.close();    
	   fout.close();      
	   fin1.close();      
	   fin2.close();       
	   System.out.println("Success..");  
  }    
}    