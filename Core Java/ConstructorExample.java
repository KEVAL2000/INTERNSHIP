package com.java.keval;

/**
* Practical 7:- Write a program demonstrate the example of constructor and parameterized constructor
* @author Keval Parmar
* @version 1.3 2022-01-25
*/
public class ConstructorExample {

	public ConstructorExample () {
		System.out.println("Using default constructor,");
		System.out.println("Jai Swaminarayan");// Print statement
	}

	public ConstructorExample (int x, int y) {
		System.out.println("Using parameterized constructor,");
		System.out.println("Addition of " + x + " and " + y + " is " + (x + y)); // Print result
	}

	public static void main(String[] args) {
		new ConstructorExample();
		new ConstructorExample(10, 10);
	}

}