package com.java.keval;

import java.util.*;

/**
* Practical : LinkedList method
* @author Keval Parmar
* @version 1.0 2022-01-29
*/
public class LinkedListExample {

	static LinkedList<String> nameList = new LinkedList<String>(); // Create linked list
	static Scanner input = new Scanner(System.in);
	static int count;

	public static void allMethod () { // Create method to display all method and choose any one method by enter number
		System.out.println("=============================");
		System.out.println("Choose method from below list");
		System.out.println("=============================");
		System.out.println("1.add() method");
		System.out.println("2.addFirst() method");
		System.out.println("3.addLast() method");
		System.out.println("4.remove() method");
		System.out.println("5.removeFirst() method");
		System.out.println("6.removeLast() method");
		System.out.println("7.removeFirstOccurrence() method");
		System.out.println("8.removeLastOccurrence() method");
		System.out.println("9.get() method");
		System.out.println("10.set() method");
		System.out.println("11.clear() method");
		System.out.println("12.size() method");
		System.out.println("13.sort() method");
		System.out.println("14.display() method");
		int choose = input.nextInt();

		switch (choose) { // Use switch case for choose method 
			case 1:
				addMethod ();
				break;

			case 2:
				addFirstMethod ();
				break;

			case 3:
				addLastMethod ();
				break;

			case 4:
				removeMethod ();
				break;

			case 5:
				removeFirstMethod ();
				break;

			case 6:
				removeLastMethod ();
				break;

			case 7:
				removeFirstOccurrenceMethod ();
				break;

			case 8:
				removeLastOccurrenceMethod ();
				break;

			case 9:
				getMethod ();
				break;

			case 10:
				setMethod ();
				break;

			case 11:
				clearMethod ();
				break;

			case 12:
				sizeMethod ();
				break;

			case 13:
				sortMethod ();
				break;

			case 14:
				displayMethod ();
				break;

			default:
				continueMethod ();
				break;
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

	public static void addFirstMethod () { // Create method to add element at first
		count = 0;
		System.out.println("Enter string which you want to enter at first in list");
		String addNew = input.next();
		nameList.addFirst(addNew); // Use addFirst() method
		count++;
		if (count == 1) {
			displayMethod ();
		}
	}

	public static void addLastMethod () { // Create method to add element at last
		count = 0;
		System.out.println("Enter string which you want to enter at last in list");
		String addNew = input.next();
		nameList.addLast(addNew); // Use addLast() method
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

	public static void removeFirstMethod () { // Create method to remove element at first
		count = 0;
		nameList.removeFirst(); // Use removeFirst() method
		count++;
		if (count == 1) {
			displayMethod ();
		}
	}

	public static void removeLastMethod () { // Create method to remove element at last
		count = 0;
		nameList.removeLast(); // Use removeLast() method
		count++;
		if (count == 1) {
			displayMethod ();
		}
	}

	public static void removeFirstOccurrenceMethod () { // Create method to remove element at first occurrence
		count = 0;
		System.out.println("Enter the string");
		String addNew = input.next();
		nameList.removeFirstOccurrence(addNew); // Use removeFirstOccurrence() method
		count++;
		if (count == 1) {
			displayMethod ();
		}
	}

	public static void removeLastOccurrenceMethod () { // Create method to remove element at last occurrence
		count = 0;
		System.out.println("Enter the string");
		String addNew = input.next();
		nameList.removeLastOccurrence(addNew); // Use removeLastOccurrence() method
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
		System.out.println("Which string you want to update from below linked list ?");
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

	public static void sizeMethod () { // Create method to calculate size of linked list
		count = 0;
		System.out.println("Size of the linked list is " + "\"" + nameList.size() + "\""); // Use size() method
		count++;
		if (count == 1) {
			continueMethod ();
		}
	}

	public static void sortMethod () { // Create method to sort element in linked list
		count = 0;
		Collections.sort(nameList); // Use sort() method
		count++;
		if (count == 1) {
			displayMethod ();
		}
	}

	public static void displayMethod () {
		if (nameList.isEmpty()) { // Check if linked list is empty or not
			System.out.print("The linked list is empty");
		} else {
			System.out.print("The linked list is as following :\n");
			for (int i = 0; i < nameList.size(); i++) {
				System.out.println((i + 1) + "." + nameList.get(i)); // Print all element
			}
		}
		continueMethod ();
	}

	public static void continueMethod () {
		System.out.println("Do you want to continue ? (y / n)");
		String result = input.next();
		if (result.equalsIgnoreCase("y")) { // Check if yes(y or Y) or no(n or N)
			allMethod ();
		} else {
			System.exit(0);
		}
	}

	public static void main (String[] args) {
		System.out.println("==========LinkedList==========");
		System.out.println("Enter value of number of input");
		int number = Integer.parseInt(input.nextLine());
		System.out.println("Enter " + number + " string");
		for (int i = 0; i < number; i++) {
			nameList.add(input.next());
		}
		allMethod ();
	}

}