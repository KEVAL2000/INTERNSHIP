package com.java.keval;

/**
* Practical 15:- Write a program to demonstrate all types of inheritance concept like
* 1 Single Inheritance
* 2 Multi level Inheritance
* 3 Hierarchical Inheritance
* 4 Hybrid Inheritance 
* @author Keval Parmar
* @version 1.0 2022-01-27
*/

class Field { // Parent class

	void print () {
		System.out.println("There are various field after 12th standard");
	}

}

class Art extends Field { // Child class

	void printArt () {
		System.out.println("Art is one of field after 12th standard");
	}

}

class Engineering extends Field { // Child class

	void printEngineering () {
		System.out.println("Engineerinng is one of field after 12th standard");
	}

}

class Medical extends Field { // Child class

	void printMedical () {
		System.out.println("Medical is one of field after 12th standard");
	}

}

public class HierarchicalInheritance { // Test Hierarchical Inheritance

	public static void main (String[] args) {
		Engineering myField = new Engineering();
		myField.print(); // Call parent class method
		myField.printEngineering(); // Call child class method
	}

}