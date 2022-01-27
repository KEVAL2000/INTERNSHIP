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

class Fruit { // Superclass

	void print () {
		System.out.println("Various fruits are available in market");
	}

}

class Mango extends Fruit { // Subclass

	void printName () {
		System.out.println("Mango is known as the king of fruit");
	}

}

public class SingleInheritance { // Test Single Inheritance

	public static void main (String[] args) {
		Mango myObject = new Mango();
		myObject.print(); // Call superclass method
		myObject.printName(); // Call subclass method
	}

}