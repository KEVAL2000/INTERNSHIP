package com.java.keval;

import java.util.HashSet;

/**
* Practical 21:- Write a program to use hashmap and hashset
* @author Keval Parmar
* @version 1.0 2022-01-28
*/
public class HashSetExample {

	public static void main (String[] args) {
		HashSet<String> list = new HashSet<String>(); // Create hashset of language
		list.add("Java"); // Add "Java"
		list.add("JSP"); // Add "JSP"
		list.add("Servlet"); // Add "Servlet"
		list.add("Java"); // Add duplicate name 
		System.out.println(list); // Print list as [Java, JSP, Servlet]
	}

}