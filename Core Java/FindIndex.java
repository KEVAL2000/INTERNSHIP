package com.java.keval;

/**
* Practical 19:- Write a program to find index of an array element
* @author Keval Parmar
* @version 1.0 2022-01-28
*/
public class FindIndex {

	public static int findNumber (int rollNumber[], int findNumber) { // Create method for find index of number in array
		if (rollNumber == null) { // Check if array is empty
			return 0;
		}

		int i = 0;
		while (i < rollNumber.length) { // Check array length
			if (rollNumber[i] == findNumber) { // Check if number is match to number in array
				return i; // Return index
			} else {
				i++; // i = i + 1;
			}
		}
		return 0;
	}

	public static void main (String[] args) {
		int[] rollNumber = {1, 2, 5, 8, 3, 4};
		System.out.println("Index of roll number 8 is " + findNumber(rollNumber, 8));
	}

}