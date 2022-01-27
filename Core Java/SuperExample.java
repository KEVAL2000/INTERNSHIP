package com.java.keval;

/**
* Practical 11:- Write a practical to use super keyword
* @author Keval Parmar
* @version 1.0 2022-01-27
*/
class ExampleNew {

	void printName () {
		System.out.println("The name is rahul parmar");
	}

}

class ChildExample extends ExampleNew {
	
	void printName () {
		System.out.println("The name is keval parmar");
	}
	void print () {
		super.printName();
	}

}

class SuperExample {

	public static void main (String[] args) {
		ChildExample childObject = new ChildExample();
		childObject.print();
	}

}