package com.rays.exception;

public class TestMistake {
	
	public static void main(String[] args)throws MistakeException {
		Dad();
		System.out.println( "hello");
		
	}
	
	private static void Dad() throws MistakeException {
		Mom();
		System.out.println("mine ");
	
	}
	
	private static void Mom() throws MistakeException {
		Son();
		System.out.println("hello"); 
	
		
	}
	
	private static void Son()throws MistakeException {
		throw new MistakeException();
		
		
	}
	
	

}
