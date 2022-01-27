package com.java.keval;

/**
* Practical 11:- Write a practical to use this keyword
* @author Keval Parmar
* @version 1.0 2022-01-27
*/
 class Example {

	String firstName;
	String lastName;

	Example (String firstName, String lastName) { // Create constructor
		this.firstName = firstName; // Use this keyword to store first name
		this.lastName = lastName; // Use this keyword to store last name
	}

	void display () { // Create method
		System.out.println("First name is " + firstName);
		System.out.println("Last name is " + lastName);
	}

}

public class ThisExample {

	public static void main (String[] args) {
		Example myObject = new Example ("Keval", "Parmar");
		myObject.display(); // Call method
	}

}