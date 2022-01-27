package com.java.keval;

/**
* Practical 6:- Write a program to demonstrate use of break / continue statement
* @author Keval Parmar
* @version 1.3 2022-01-25
*/
public class BreakContinue { 

	public static void main(String[] args) {
		int count = 1; // Declare count variable

		while (count <= 10) {
			if (count == 5 ) {
				count++;
				continue; // Skip number 5
			}

			System.out.print(count + " "); // Print number
			count++; // count = count + 1;

			if (count == 8) {
				break; // Break number from 8
			}
		}
	}

}