package com.java.iostreams;

import java.io.File;
import java.io.IOException;

public class FileExample1 {
    public static void main(String[] args) {  
        try {  
           //Relative Path
//        	File file = new File("javaFile135.txt");  
        	//Absolute Path
        	File file = new File("C:\\Users\\skatt\\17Aug23\\javaFile135.txt");  
            if (file.createNewFile()) {  
                System.out.println("New File is created!");  
            } else {  
                System.out.println("File already exists OR Unable to create the file.");  
            }  
        } catch (IOException e) {  
            e.printStackTrace();  
        }   
    }  
}
