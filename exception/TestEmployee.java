package com.rays.exception;

import java.util.ArrayList;

public class TestEmployee {
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1,"shradha",22);
		Employee e2 = new Employee(5,"bittu",24);
		Employee e3 = new Employee(5,"vijay",24);
		Employee e4 = new Employee(2,"dheeraj",25);
		Employee e5 = new Employee(3,"sonam",26);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		System.out.println(e5);
		
		ArrayList List = new ArrayList();
		
		List.add(e1);
		List.add(e2);
		List.add(e3);
		List.add(e4);
		List.add(e5);
		
		System.out.println(List);
		
		Employee e = (Employee)List.get(1);
		System.out.println(e);
	
		
		
		
		
		
	}

}
