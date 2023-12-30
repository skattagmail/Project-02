package com.java.iostreams;

import java.io.*;

public class BufferedInputStreamExample {
	public static void main(String args[]) {
		try {
			FileInputStream fin = new FileInputStream("C:\\\\Users\\\\skatt\\\\17Aug23\\\\file1.txt");
			BufferedInputStream bin = new BufferedInputStream(fin);
			int i;
			while ((i = bin.read()) != -1) {
				System.out.print((char) i);
			}
			bin.close();
			fin.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}