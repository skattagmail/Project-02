package com.java.iostreams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JavaCreateDirectory {

    public static void main(String[] args) throws IOException {
	        String fileSeparator = System.getProperty("file.separator");
	    	String directoryName = "C:" + fileSeparator+"Users"+fileSeparator+"skatt"+fileSeparator+"TEST-AS-2023";

	    	
	        Path path = Paths.get(directoryName);
	        if (!Files.exists(path)) {
	            Files.createDirectory(path);
	            System.out.println("Directory created");
	        } else {
	            System.err.println("Directory already exists");
	        }
	    }
	}
