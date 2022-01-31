package com.java.keval;

import java.util.ArrayList;
import java.util.HashSet;

/**
* Practical 22:- Write a program to prepare list like ('A', 'B', 'C', D', 'A', 'C', 'E', 'E', 'E')
* and remove duplicate from list
* @author Keval Parmar
* @version 1.0 2022-01-28
*/
public class RemoveDuplicate {

	public static void main (String[] args) {
		ArrayList<String> alphabetList = new ArrayList<String>(); // Create object of alphabet list
		alphabetList.add("A"); // Add "A"
		alphabetList.add("B");
		alphabetList.add("C");
		alphabetList.add("D");
		alphabetList.add("A");
		alphabetList.add("C");
		alphabetList.add("E");
		alphabetList.add("E");
		alphabetList.add("E");
		System.out.println("Before delete duplicate value, alphabet list is :");
		System.out.println(alphabetList);

		HashSet<String> removeDuplicate = new HashSet<String>(alphabetList); // Delete duplicate value in alphabet list
		System.out.println("After delete duplicate value, alphabet list is :");
		System.out.println(removeDuplicate);
	}

}