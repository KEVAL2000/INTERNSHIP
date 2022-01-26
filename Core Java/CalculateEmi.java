package com.java.keval;

import java.util.Scanner;

/**
* Practical 8:- Write a program to calculate emi
* @author Keval Parmar
* @version 1.3 2022-01-25
*/

public class CalculateEmi {

	public void calculate (double pa, double ir, double ld) { // Method to calculate emi
		ir = ir / (12 * 100);
		ld = ld * 12;
		double result = (pa * ir * Math.pow(1 + ir, ld)) / (Math.pow(1 + ir, ld) - 1); // Formula to calculate emi
		System.out.println("Emi is " + result); // Print result
	}

	public static void main (String[] args) {
		Scanner input = new Scanner(System.in); // Create input object

		System.out.println("Enter principle amount : ");
		double principleAmount = input.nextDouble(); // Take input

		System.out.println("Enter interest rate : ");
		double interestRate = input.nextDouble(); // Take input

		System.out.println("Enter loan duration : ");
		double loanDuration = input.nextDouble(); // Take input

		CalculateEmi calculateEmi = new CalculateEmi(); // Create calculateEmi object
		calculateEmi.calculate (principleAmount, interestRate, loanDuration); // Call calculate() method
	}

}