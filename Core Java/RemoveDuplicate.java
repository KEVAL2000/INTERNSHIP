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
		ArrayList<String> list = new ArrayList<String>(); // Create object of list
		list.add("A"); // Add "A"
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("A");
		list.add("C");
		list.add("E");
		list.add("E");
		list.add("E");
		System.out.println("Before delete duplicate value, list is :");
		System.out.println(list);

		HashSet<String> removeDuplicate = new HashSet<String>(list); // Delete duplicate value in list
		System.out.println("After delete duplicate value, list is :");
		System.out.println(removeDuplicate);
	}

}