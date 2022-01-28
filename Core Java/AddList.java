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
		ArrayList<String> list = new ArrayList<String>(); // Create object of list
		list.add("Hello"); // Add "Hello"
		list.add("World"); // Add "World"
		list.add("Keval"); // Add "Keval"
		Iterator<String> iterate = list.iterator(); // Print output using iterator
		System.out.println(iterate.next()); // Print "Hello"
		System.out.println(iterate.next()); // Print "World"
		System.out.println(iterate.next()); // Print "Keval"
	}

}