package com.demo.wrapper;

import java.util.ArrayList;

public class ToStringConversion {
	
	public static void main(String[] args) {
		Integer myInt=100;
		String myString=myInt.toString();
		System.out.println(myString.length());
		System.out.println(myString.charAt(0));
		System.out.println(myString.charAt(1));
		System.out.println(myString.charAt(2));
		System.out.println(myString.hashCode());
		
		ArrayList<Integer> ar = new ArrayList<Integer>(); // Making an ArrayList of type Integer.
	    ar.add(0, 3);
	    ar.add(1, 5);
	    ar.add(2, 10);
	    ar.add(3, 33);
	    String str= ar.toString();
	    System.out.println(str);
	    System.out.println("Str length is : " +str.length());
	    
	    int num = ar.get(1);	    
	    System.out.println(num);
	    
	    //String num1 = str.indexOf(1);	    
	    System.out.println(num);
	   

	}

}
