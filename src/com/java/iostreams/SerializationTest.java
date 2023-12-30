package com.java.iostreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationTest {
	
	public static void main(String[] args) {
		String fileName="employee.txt";
		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("Pankaj");
		emp.setSalary(5000);
		emp.setPassword("abcde");
		
		//serialize to file
//		try {
//			FileOutputStream fos = new FileOutputStream(fileName);
//			ObjectOutputStream oos = new ObjectOutputStream(fos);
//			oos.writeObject(emp);
//
//			fos.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//			return;
//		}
		
		Employee empNew = null;
		try {
			FileInputStream fis = new FileInputStream(fileName);
			ObjectInputStream ois = new ObjectInputStream(fis);
			empNew = (Employee) ois.readObject();
			ois.close();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("emp Object Before Serialization::"+emp);
		System.out.println("emp Object after Serialization::"+empNew);
	}
}
