package com.rays.exception;

public class Employe {
	
		private int id;
		private String  name;
		private int  age;
		
		public Employe (int id, String name, int age) {
			this.id = id;
			this.name = name;
			this.age = age;
			
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getId() {
			return id;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public  int getAge() {
			return age;
		}
		
		@Override
		public String toString() {
			return(this.id +" " +this.name +" "+this.age);
		
		}@Override
		public int hashCode() {
		return name.hashCode();
		}
		
		@Override
		public boolean equals(Object obj) {
		return super.equals(obj);
		}
	

		}
	
		
		

		
	
	


