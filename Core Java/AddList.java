package com.java.keval;

import java.util.ArrayList;
import java.util.Iterator;

/**
* Practical 20:- Write a program to add string values in the list and print all the values using iterator
* @author Keval Parmar
* @version 1.0 2022-01-28
*/
public class AddList {

	public static void main (String[] args) {
		ArrayList<String> infoList = new ArrayList<String>(); // Create object of list
		infoList.add("Hello"); // Add "Hello"
		infoList.add("World"); // Add "World"
		infoList.add("Keval"); // Add "Keval"

		Iterator<String> iterate = infoList.iterator(); // Print output using iterator
		System.out.println(iterate.next()); // Print "Hello"
		System.out.println(iterate.next()); // Print "World"
		System.out.println(iterate.next()); // Print "Keval"
	}

}