package com.java.keval;

import java.util.HashMap;

/**
* Practical 21:- Write a program to use hashmap and hashset
* @author Keval Parmar
* @version 1.0 2022-01-28
*/
public class HashMapExample {

	public static void main (String[] args) {
		HashMap<String, Integer> list = new HashMap<String, Integer>(); // Create hashmap of name and roll number
		list.put("Keval", 55); // Add name "Keval" and roll number "55"
		list.put("Harsh", 20);
		list.put("Mitul", 37);
		System.out.println(list); // Print list as {name = roll number}
	}

}