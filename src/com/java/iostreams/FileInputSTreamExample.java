package com.java.iostreams;

import java.io.FileInputStream;  
public class FileInputSTreamExample {  
     public static void main(String args[]){    
          try{    
            FileInputStream fin = new FileInputStream("C:\\Users\\skatt\\17Aug23\\file1.txt");    
            int i=fin.read();  
            System.out.println(i);
            System.out.print((char)i);    
  
            fin.close();    
          }catch(Exception e){System.out.println(e);}    
         }    
        }  