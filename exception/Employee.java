package com.rays.exception;

public class Employee {
	
	private Integer id;
	private String name;
	private Integer age;
	
	Employee(int id, String name, int age){
		this.id = id;
		this.name = name;
		this.age = age;
		
	}
	public void setId(int id ) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setName(String Name ) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getage() {
		return age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.id + " " + this.name + " " + this.age;
	}
	@Override
	public boolean equals(Object o) {
		if( o == null) {		
		return false;
		
	}
    if (!(o instanceof Employee)) {
    	return false;
    	
    }
    Employee e = (Employee) o;
    
  if (this.id == e.id && this.name == e.name && this.age == e.age) {
  return true ;
	}else{
		return false;
	}
		
	//	return this.name == e.name && this.id == e.id && this.age == e.age:
		
	} 
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return id.hashCode()+ name.hashCode()+ age.hashCode();
  	}
}

