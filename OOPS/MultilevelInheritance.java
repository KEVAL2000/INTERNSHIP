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
class VehicleCompany { // Parent class

	void printName () {
		System.out.println("There are various vehicle company in gujarat");
	}

}

class TataCompany extends VehicleCompany { // Child class

	void printCompany () {
		System.out.println("like tata is biggest automobile company");
	}

}

class Nexon extends TataCompany { // Sub Child class

	void printModel () {
		System.out.println("Latest model of tata company is tata nexon");
	}

}

public class MultilevelInheritance { // Test Multilevel Inheritance

	public static void main (String[] args) {
		Nexon myModel = new Nexon();
		myModel.printName(); // Call parent class method
		myModel.printCompany(); // Call child class method
		myModel.printModel(); // Call sub child class method
	}

}