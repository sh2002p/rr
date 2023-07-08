package com.rays.exception;

public class MultipleException2 {
	public static void main(String[] args) {
		String name = "vijay";
		try {
			
			System.out.println("Length=" + name.length());
			System.out.println("Character=" + name.charAt(4));
			
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println("string Ex=" +e.getMessage());
			e.printStackTrace();
			
		}catch(NullPointerException e) {
			System.out.println("Null Ex=" + e.getMessage());
			
		}catch(Exception e) {
			System.out.println("Exp Ex=" +e.getMessage());	
		}
}
}