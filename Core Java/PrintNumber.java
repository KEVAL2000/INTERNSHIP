package com.java.keval;

/**
* Practical 4:- Write a program to demonstrate use of while loop and do while loop
* @author Keval Parmar
* @version 1.3 2022-01-25
*/
public class PrintNumber {

	public static void main(String[] args) {
		System.out.println("Using while loop");
		int count = 1; // Declare count variable

		while (count <= 10) {
			System.out.print(count + " ");
			count++; // count = count + 1;
		}

		System.out.println("\nUsing do while loop");
		int number = 1; // Declare number variable

		do {
			System.out.print(number + " ");
			number++; // number = number + 1;
		} while (number <= 10);
	}

}