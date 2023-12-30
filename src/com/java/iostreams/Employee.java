package com.java.iostreams;

import java.io.Serializable;

public class Employee implements Serializable {
	
		private static final long serialVersionUID = 1L;
		public String name;
		public int id;
		transient int salary;
		public String password;
		public String gender;
		
		@Override
		public String toString(){
			return "Employee{name="+name+",id="+id+",salary="+salary+", Password = " + password +"}";
		}
		
		//getter and setter methods
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getSalary() {
			return salary;
		}

		public void setSalary(int salary) {
			this.salary = salary;
		}

		public String getPassword() {
			return password;
		}
	
		public void setPassword(String password) {
			this.password = password;
		}
		
	}
