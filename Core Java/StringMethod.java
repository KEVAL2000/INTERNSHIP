package com.java.keval;

/**
* Practical 10:- Create a program of all string method like charAt() concat() equals()
* @author Keval Parmar
* @version 1.0 2022-01-27
*/
public class StringMethod {

	public static void main (String[] args) {
		String animal = "cat";
		String vehical = "car";

		System.out.println("Using charAt() method,");
		System.out.println("Character at index 0 is " + animal.charAt(0));
		System.out.println("Character at index 1 is " + animal.charAt(1));
		System.out.println("Character at index 2 is " + animal.charAt(2));

		System.out.println("Using concat() method,");
		System.out.println("Concatenation of strings is " + animal.concat(vehical));

		System.out.println("Using equals() method,");
		if (animal.equals(vehical)) {
			System.out.println("same");
		} else {
			System.out.println("different");
		}

	}

}