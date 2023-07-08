package com.rays.exception;

import java.util.ArrayList;

public class TestEmploye {
	public static void main(String[] args) {
		
		Employe e1 = new Employe(1, "bittu", 22);
		Employe e2 = new Employe(2, "vijay", 24);
		Employe e3 = new Employe(3, "sonam", 26);
		Employe e4 = new Employe(4, "shivani",25);
		Employe e5 = new Employe(5, "aditya",19);
		System.out.println(e1);
		
		ArrayList list = new ArrayList();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		System.out.println(list);
		System.out.println(e1.getId());
		System.out.println(e2.getName());
	}
	

}

