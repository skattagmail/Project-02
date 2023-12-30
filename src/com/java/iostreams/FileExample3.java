package com.java.iostreams;

import java.io.File;

public class FileExample3 {
	public static void main(String[] args) {  
	    File f=new File("C:\\Users\\skatt\\eclipse-workspace\\Training\\Streams");  
	    String filenames[]=f.list();  
	    for(String filename:filenames){  
	        System.out.println(filename);  
	    }  
	}  
}
