package com.java.iostreams;

import java.io.FileOutputStream;  
public class FileOutputStreamExample1 {  
    public static void main(String args[]){    
       try{    
	         FileOutputStream fout=new FileOutputStream("C:\\Users\\skatt\\17Aug23\\file3.txt");    
	         String s="Welcome to Streams.";    
	         byte b[]=s.getBytes();//converting string into byte array   
	         System.out.println("Byte ARray: " + b);
	         fout.write(b);    
	         fout.close();    
	         System.out.println("success...");    
        }catch(Exception e){
        	System.out.println(e);
        }    
      }    
}  