package com.java.iostreams;

import java.io.File;

public class FileExample2 {
    public static void main(String[] args) {      	  
        String path = "";  
        boolean bool = false;  
        try {  
            // createing  new files  
            File file  = new File("testFile1.txt");  
            file.createNewFile();  
            System.out.println(file);  
            
            // creating new canonical from file object  
            File file2 = file.getCanonicalFile();  
            // returns true if the file exists  
            System.out.println("Canonical File :" + file2);  
            bool = file2.exists();  
            // returns absolute pathname  
            path = file2.getAbsolutePath();  
            System.out.println(bool); 
            
            // if file exists  
            if (bool) {  
                // prints  
                System.out.print(path + " Exists? " + bool);  
            }  
        } catch (Exception e) {  
            // if any error occurs  
            e.printStackTrace();  
        }  
    }  
}
