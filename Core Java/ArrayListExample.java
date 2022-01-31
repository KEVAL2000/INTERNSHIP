package com.java.keval;

import java.util.*;

/**
* Practical : ArrayList Methods
* @author Keval Parmar
* @version 1.0 2022-01-28
*/
public class ArrayListExample {

	static ArrayList<String> nameList = new ArrayList<String>(); // Create array list
	static Scanner input = new Scanner(System.in);
	static int count;

	public static void allMethod () { // Create method to display all method and choose any one method by enter number
		System.out.println("=============================");
		System.out.println("Choose method from below list");
		System.out.println("=============================");
		System.out.println("1.add() method");
		System.out.println("2.get() method");
		System.out.println("3.set() method");
		System.out.println("4.remove() method");
		System.out.println("5.clear() method");
		System.out.println("6.size() method");
		System.out.println("7.sort() method");
		System.out.println("8.display() method");
		int choose = input.nextInt();

		switch (choose) { // Use switch case for choose method 
			case 1:
				addMethod ();
				break;

			case 2:
				getMethod ();
				break;

			case 3:
				setMethod ();
				break;

			case 4:
				removeMethod ();
				break;

			case 5:
				clearMethod ();
				break;

			case 6:
				sizeMethod ();
				break;

			case 7:
				sortMethod ();
				break;

			case 8:
				displayMethod ();
				break;
				
			default:
				continueMethod ();
		}
	}

	public static void addMethod () { // Create method to add element
		count = 0;
		System.out.println("Enter string which you want to enter");
		String addNew = input.next();
		nameList.add(addNew); // Use add() method
		count++;
		if (count == 1) {
			displayMethod ();
		}
	}

	public static void getMethod () { // Create method to get element
		count = 0;
		for (int i = 0; i < nameList.size(); i++) {
			System.out.println("Element at index " + i + " is " + "\"" + nameList.get(i) + "\""); // Use get() method
		}
		count++;
		if (count == 1) {
			continueMethod ();
		}
	}

	public static void setMethod () { // Create method to set element
		count = 0;
		System.out.println("Which string you want to update from below array list ?");
		for (int i = 0; i < nameList.size(); i++) {
			System.out.println((i + 1) + "." + nameList.get(i));
		}
		System.out.println("Enter the index");
		int index = input.nextInt();
		System.out.println("Enter the data");
		String addNew = input.next();
		nameList.set(index - 1, addNew); // Use set() method
		count++;
		if (count == 1) {
			displayMethod ();
		}
	}

	public static void removeMethod () { // Create method to remove element
		count = 0;
		System.out.println("Enter the index");
		int index = input.nextInt();
		nameList.remove(index - 1); // Use remove() method
		count++;
		if (count == 1) {
			displayMethod ();
		}
	}

	public static void clearMethod () { // Create method to clear all element
		System.out.println("Do you want to delete all data ? (y / n)");
		String result = input.next();
		if (result.equalsIgnoreCase("y")) {
			nameList.clear(); // Use clear() method
			displayMethod ();
		} else {
			continueMethod ();
		}
	}

	public static void sizeMethod () { // Create method to calculate size of array list
		count = 0;
		System.out.println("Size of the array list is " + "\"" + nameList.size() + "\""); // Use size() method
		count++;
		if (count == 1) {
			continueMethod ();
		}
	}

	public static void sortMethod () { // Create method to sort element in array list
		count = 0;
		Collections.sort(nameList); // Use sort() method
		count++;
		if (count == 1) {
			displayMethod ();
		}
	}

	public static void displayMethod () { // Create method to display element of array list
		if (nameList.isEmpty()) { // Check if array list is empty or not
			System.out.print("The array list is empty");
		} else {
			System.out.print("The array list is as following :\n");
			for (int i = 0; i < nameList.size(); i++) {
				System.out.println((i + 1) + "." + nameList.get(i)); // Print all element
			}
		}
		continueMethod ();
	}

	public static void continueMethod () { // Create method to prompt user to ask "Do you want to continue ? (y / n)"
		System.out.println("Do you want to continue ? (y / n)");
		String result = input.next();
		if (result.equalsIgnoreCase("y")) { // Check if yes(y or Y) or no(n or N)
			allMethod ();
		} else {
			System.exit(0);
		}
	}

	public static void main (String[] args) {
		System.out.println("==========ArrayList==========");
		System.out.println("Enter value of number of input");
		int number = Integer.parseInt(input.nextLine());
		System.out.println("Enter " + number + " string");
		for (int i = 0; i < number; i++) {
			nameList.add(input.next());
		}
		allMethod ();
	}

}