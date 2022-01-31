package com.java.keval;

/**
* Practical 14:- Write a program to demonstrate encapsulation
* @author Keval Parmar
* @version 1.0 2022-01-27
*/
class Encapsulation {

	private String name;
	private String branch;

	public String getName () {
		return name;
	}

	public String getBranch () {
		return branch;
	}

	public void setName (String name) { // Use setter method
		this.name = name;
	}

	public void setBranch (String branch) { // Use setter method
		this.branch = branch;
	}

}

class EncapsulationExample {

	public static void main (String[] args) {
		Encapsulation myObject = new Encapsulation();
		myObject.setName("Keval"); // Call setter method
		myObject.setBranch("IT"); // Call setter method
		System.out.println("Name is " + myObject.getName() + " and Branch is " + myObject.getBranch()); // Call getter method
	}

}