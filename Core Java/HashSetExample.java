package com.java.keval;

import java.util.HashSet;

/**
* Practical 21:- Write a program to use hashmap and hashset
* @author Keval Parmar
* @version 1.0 2022-01-28
*/
public class HashSetExample {

	public static void main (String[] args) {
		HashSet<String> progLanguage = new HashSet<String>(); // Create hashset of language
		progLanguage.add("Java"); // Add "Java"
		progLanguage.add("JSP"); // Add "JSP"
		progLanguage.add("Servlet"); // Add "Servlet"
		progLanguage.add("Java"); // Add duplicate name 
		System.out.println(progLanguage); // Print list as [Java, JSP, Servlet]
	}

}