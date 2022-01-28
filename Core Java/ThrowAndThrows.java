package com.java.keval;
/** 
* Practical 18:- Write a program to handle exceptions using try catch finally throw and throws keywords 
* @author Keval Parmar
* @version 1.0 2022-01-27
*/
public class ThrowAndThrows {

	public static void checkNumber (int number) throws ArithmeticException { // Handle exception
		if (number < 18) {
			throw new ArithmeticException("You are not eligible"); // Throw exception
		} else {
			System.out.println("You are eligible");
		}
	}

	public static void main (String[] args) {
		try {
			checkNumber (17); // Call method
		} catch (ArithmeticException e) {
			System.out.println("You are valid");
		} finally {
			System.out.println("Thank You!");
		}
	}

}