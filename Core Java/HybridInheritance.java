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
class Sandwitch { // Parent class

	void print () {
		System.out.println("There are various types of sandwitch available");
	}

}

class Cold extends Sandwitch { // Child class

	void printCold () {
		System.out.println("Cold Sandwitch is one type of sandwitch");
	}

}

class Hot extends Sandwitch { // Another Child class

	void printHot () {
		System.out.println("Hot Sandwitch is one type of sandwitch");
	}

}

class Cheese extends Cold { // Sub child class

	void printCheese () {
		System.out.println("Cheese sandwitch is a type of cold sandwitch");
	}

}

class Tuna extends Cold { // Another Sub child class

	void printTuna () {
		System.out.println("Tuna sandwitch is a type of cold sandwitch");
	}

}

public class HybridInheritance { // Test Hybrid Inheritance

	public static void main (String[] args) {
		Tuna mySandwitch = new Tuna();
		mySandwitch.printTuna(); // call sub child class method
	}

}