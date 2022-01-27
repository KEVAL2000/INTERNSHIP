package com.java.keval;

/**
* Practical 2:- Write a program to demonstrate use of if / else statements
* Note:- Define an 'age' variable and check your age
* @author Keval Parmar
* @version 1.3 2022-01-25
*/
public class CheckAge {

	public static void main(String[] args) {
		final int eighteen = 18; // Declare constant variable
		int age = 20; // Declare age variable

		if (age >= eighteen) { // Check condition
			System.out.println("You are eligible for voting");
		} else {
			System.out.println("Sorry! You are not eligible for voting");
		}
	}

}