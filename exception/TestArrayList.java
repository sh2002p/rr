package com.rays.exception;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestArrayList {
	public static void main(String[] args) {
		Collection list1 = new ArrayList();
		
		list1.add("blue");
		list1.add("true");
		list1.add("100");
		list1.add("black");
		
		Iterator it = list1.iterator();
		System.out.println(it.hasNext());
		
		while(it.hasNext()) {
			System.out.println(it.next()); 
			
		}
				
		
				
	}

}
