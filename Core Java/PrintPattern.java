package com.java.keval;

/**
* Practical 5:- Write a program to demonstrate the example of for loop
* @author Keval Parmar
* @version 1.3 2022-01-25
*/

public class PrintPattern {

	public static void main(String[] args) {
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*" + " "); // Print star pattern
			}
			System.out.println(" "); // Insert new line
		}
	}

}