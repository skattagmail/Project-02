package com.java.iostreams;

import java.io.FileOutputStream;
import java.io.IOException;  
public class FileOutputStreamExample {  
	
    public static void main(String args[]){  
    	FileOutputStream fout = null;
       try{    
	         fout=new FileOutputStream("C:\\Users\\skatt\\17Aug23\\file2.txt");    
	         fout.write(65); 
	         System.out.println("success...");    
        }catch(Exception e){
        	System.out.println(e);
        	e.printStackTrace();
        }  finally {
 				try {
 					System.out.println("In Finally Block");
					fout.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}    
        }
      }    
}  