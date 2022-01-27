package com.java.keval;

/**
* Practical 16:- Write a program to demonstrate two types of polymorphism like
* compiletime and runtime polymorphism
* @author Keval Parmar
* @version 1.0 2022-01-27
*/
public class CompileTime {

	void sum (int x, int y) {
		System.out.print(x + y);
	}

	void sum (int x, int y, int z) {
		System.out.println(" ");
		System.out.print(x + y + z);
	}

	public static void main (String[] args) {
		CompileTime mySum = new CompileTime();
		mySum.sum(10, 20);
		mySum.sum(10, 20, 30);
	}

}