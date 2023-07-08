package com.rays.exception;

import java.util.Enumeration;
import java.util.Vector;

public class VectoreList {
	public static void main(String[] args) {
		Vector list = new Vector();
		
		list.add("bittu");
		list.add(true);
		list.add(50);
		list.add("black");
		list.add(true);
		list.add("mahi");
		list.add(200);
		list.add("red");
		
		
	Enumeration v = list.elements();
	while(v.hasMoreElements()) {
		System.out.println(v.nextElement());
	}
		
		
	} 
	

}
