package com.java.keval;

/**
* Practical 16:- Write a program to demonstrate two types of polymorphism like
* compiletime and runtime polymorphism
* @author Keval Parmar
* @version 1.0 2022-01-27
*/
class Parent {

	void method () { // Parent class method
		System.out.println("This is method 1");
	}

}

public class RunTime extends Parent {

	void method () { // Runtime class method
		System.out.println("This is method 2");
	}

	public static void main (String[] args) {
		Parent myObject = new RunTime();
		myObject.method(); // Call Runtime class method 
	}

}