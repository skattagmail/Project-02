package com.java.iostreams;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CreateNewFile {

    /**
     * This class shows how to create a File in Java
     * @param args
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
        String fileSeparator = System.getProperty("file.separator");
        System.out.println("fileSeparator: " + fileSeparator);
        
        //absolute file name with path
        String absoluteFilePath = "C:" + fileSeparator+"Users"+fileSeparator+"skatt"+fileSeparator+"AS"+fileSeparator+"myfile1030.txt"; // C:/Users/skatt/file.txt"
        String absoluteFilePath1 = "C:" + fileSeparator+"Users"+fileSeparator+"skatt"+fileSeparator+"AS"+fileSeparator+ "30Oct23.txt";

        //Creating the file with absolute path
        File file = new File(absoluteFilePath);  //Initializing the file
        if(file.createNewFile()){
            System.out.println(absoluteFilePath+" File Created");
        }else 
        	System.out.println("File "+absoluteFilePath+" already exists");
        
        //file name only -- Creating the file with Relative Path
        File file1 = new File("30Oct23file.txt");
        if(file1.createNewFile()){
            System.out.println("file.txt File Created in Project root directory");
        }else 
        	System.out.println("File file.txt already exists in the project root directory");
        
////        //relative path
        String relativePath = "tmp"+fileSeparator+"05Mar22Reportfile112.txt"; // tmp\Reportfile.txt
        file = new File(relativePath);
        if(file.createNewFile()){
            System.out.println(relativePath+" File Created in Project root directory");
        }else 
        	System.err.println("File "+relativePath+" already exists in the project root directory");

		String fileData = "Java training";
		FileOutputStream fos = new FileOutputStream(absoluteFilePath1);
		fos.write(fileData.getBytes());
		fos.flush();
		fos.close();

		 fileData = "File Creation Methods";
		Files.write(Paths.get("name1.txt"), fileData.getBytes());
		
//		file = new File(absoluteFilePath); 
//		if(file.exists()) {
//			file.delete();
//		}


   }

}
