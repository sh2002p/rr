package com.rays.exception;

public class EmployeHC {
	public static void main(String[] args) {
		
		Employe hc1 = new Employe(01,"shradha",22);
		Employe hc2 = new Employe(02,"shradha",25);
		
		System.out.println(hc1.hashCode());
		System.out.println(hc2.hashCode());
	}

}
