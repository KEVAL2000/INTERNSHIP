package com.java.keval;

/** 
* Practical 18:- Write a program to handle exceptions using try catch finally throw and throws keywords 
* @author Keval Parmar
* @version 1.0 2022-01-27
*/
public class ExceptionExample {

	public static void main (String[] args) {
		try { // Test block of code
			int numbers[] = {1, 2, 3};
			System.out.println(numbers[10]);
		} catch (Exception e) { // Catch exception
			System.out.println(e);
		} finally { // Executed whether exception is occurred or not
			System.out.println("Finally block is executed");
		}
	}

}