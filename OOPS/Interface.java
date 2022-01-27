package com.java.keval;

/**
* Practical 17:- Write a program to demonstrate interface
* @author Keval Parmar
* @version 1.0 2022-01-27
*/
interface Language { // Create interface

	void getName (String name); // Abstract method without body

}

class Programming implements Language { // Class implements interface

	public void getName (String name) { // Implementation of abstract method
		System.out.println(name + " is a programming language");
	}

}

public class Interface {

	public static void main (String[] args) {
		Programming myLanguage = new Programming();
		myLanguage.getName("Java"); // Call getName() method
	}

}