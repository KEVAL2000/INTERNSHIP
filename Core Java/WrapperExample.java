package com.java.keval;

/**
* Practical 9:- Create a practical to compare two variable of wrapper class
* @author Keval Parmar
* @version 1.0 2022-01-27
*/
public class WrapperExample {

	public static void main (String[] args) {
		Integer a = new Integer(10);
		Integer b = new Integer(10);

		int result = a.compareTo(b);
		System.out.println(result);
	}

}