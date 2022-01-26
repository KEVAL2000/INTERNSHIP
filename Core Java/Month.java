package com.java.keval;

import java.util.Scanner;

/**
* Practical 3:- Write a program to find the current month name from the given number of the switch case
* @author Keval Parmar
* @version 1.3 2022-01-25
*/

public class Month { 

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Create input object
		System.out.println("Enter month number between (1 to 12) : ");
		int monthNumber = input.nextInt(); // Take input

		switch (monthNumber) { // Switch case check condition
			case 1:
				System.out.println("Given month is January");
				break;

			case 2:
				System.out.println("Given month is February");
				break;

			case 3:
				System.out.println("Given month is March");
				break;

			case 4:
				System.out.println("Given month is April");
				break;

			case 5:
				System.out.println("Given month is May");
				break;

			case 6:
				System.out.println("Given month is June");
				break;

			case 7:
				System.out.println("Given month is July");
				break;

			case 8:
				System.out.println("Given month is August");
				break;

			case 9:
				System.out.println("Given month is September");
				break;

			case 10:
				System.out.println("Given month is October");
				break;

			case 11:
				System.out.println("Given month is November");
				break;

			case 12:
				System.out.println("Given month is December");
				break;

			default:
				System.out.println("Invalid Number");
				break;
		}
	}

}