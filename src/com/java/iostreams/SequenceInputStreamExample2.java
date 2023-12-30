package com.java.iostreams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;    

// reads data using enumeration
class SequenceInputStreamExample2{    
	public static void main(String args[])throws IOException{    
		//creating the FileInputStream objects for all the files    
		FileInputStream fin=new FileInputStream("C:\\\\Users\\\\skatt\\\\files\\\\fileout1.txt");    
		FileInputStream fin2=new FileInputStream("C:\\\\Users\\\\skatt\\\\files\\\\fileout2.txt");    
		FileInputStream fin3=new FileInputStream("C:\\\\Users\\\\skatt\\\\files\\\\bufout1.txt");    
		FileInputStream fin4=new FileInputStream("C:\\\\Users\\\\skatt\\\\files\\\\seqinfile1.txt");  
		
		//creating Vector object to all the stream    
		Vector v=new Vector();    
		v.add(fin);    
		v.add(fin2);    
		v.add(fin3);    
		v.add(fin4);              
		//creating enumeration object by calling the elements method    
		Enumeration e=v.elements();      
		//passing the enumeration object in the constructor    
		SequenceInputStream bin=new SequenceInputStream(e);    
	
		int i=0;      
		while((i=bin.read())!=-1){    
			System.out.print((char)i);    
		}     
		bin.close();    
		fin.close();    
		fin2.close();    
	}    
}    