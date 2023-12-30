package com.java.iostreams;

import java.io.*;  
public class ByteArrayOutputStreamExample {  
	public static void main(String args[])throws Exception{    
	      FileOutputStream fout1=new FileOutputStream("C:\\Users\\skatt\\17Aug23\\file4.txt");    
	      FileOutputStream fout2=new FileOutputStream("C:\\Users\\skatt\\17Aug23\\file5.txt");    
	        
	      ByteArrayOutputStream bout=new ByteArrayOutputStream();    
	      bout.write(65);    
	      bout.writeTo(fout1);    
	      bout.writeTo(fout2);    
	        
	      bout.flush();    
	      bout.close();//has no effect   
	      fout1.close();
	      fout2.close();
	      System.out.println("Success...");    
	}    
}   