package com.java.keval;

/**
* Practical 13:- Write a program to demonstrate data abstraction
* @author Keval Parmar
* @version 1.0 2022-01-27
*/
abstract class Vehicle {

	abstract void printCompany ();

}

class Tata extends Vehicle {

	void printCompany () {
		System.out.println("Company name is Tata");
	}

}

class Ford extends Vehicle {

	void printCompany () {
		System.out.println("Company name is Ford");
	}

}

public class AbstractionExample {

	public static void main (String[] args) {
		Vehicle myVehicle = new Tata();
		myVehicle.printCompany();
	}

}