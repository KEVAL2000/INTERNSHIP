package com.java.keval;

/**
* Practical 12:- Write a program to demonstrate static method variable and block
* @author Keval Parmar
* @version 1.0 2022-01-27
*/
public class StaticExample {

	static String firstName = "Keval"; // Use static variable
	static String middleName = "Ashwinbhai"; // Use static variable
	static String lastName = "Parmar"; // Use static variable
	static String fullName; // Use static variable

	static { // Use static block
		fullName = firstName + " " + middleName + " " + lastName;
	}

	static void print (int age) { // Use static method
		System.out.println("Full name is " + fullName + " and Age is " + age);
	}

	public static void main (String[] args) {
		print (21); // Call static method
	}

}