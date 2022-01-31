package com.java.keval;

import java.util.*;

/**
* Practical : ArrayList Method
* @author Keval Parmar
* @version 1.0 2022-01-29
*/
public class ArrayListExample2 {

	public static void main (String[] args) {
		ArrayList<String> nameList1 = new ArrayList<String>(); // Create first array list
		nameList1.add("Keval");
		nameList1.add("Harsh");
		nameList1.add("Mitul");
		System.out.println("Create a first array list\n" + nameList1);
		ArrayList<String> nameList2 = new ArrayList<String>(); // Create second array list
		nameList2.add("Brahma");
		nameList2.add("Vishnu");
		nameList2.add("Mahesh");
		System.out.println("Create a second array list\n" + nameList2);
		nameList1.addAll(nameList2); // Use addAll() method
		System.out.println("After adding second arraylist element into first arraylist\n" + nameList1);
		System.out.println("");
		ArrayList<String> nameList3 = new ArrayList<String>(); // Create third array list
		nameList3.add("Ahmedabad");
		nameList3.add("Surat");
		nameList3.add("Bhavnagar");
		System.out.println("Create a third array list\n" + nameList3);
		nameList3.add(3, "Vadodara"); // Use add() method
		System.out.println("After adding Vadodara at index 3\n" + nameList3);
		ArrayList<String> nameList4 = new ArrayList<String>(); // Create forth array list
		nameList4.add("Delhi");
		nameList4.add("Mumbai");
		nameList4.add("Chennai");
		System.out.println("Create a forth array list\n" + nameList4);
		nameList3.addAll(1, nameList4); // Use addAll() method
		System.out.println("After adding forth arraylist element into thirs arraylist at index 1\n" + nameList3);
		System.out.println("");
		ArrayList<String> nameList5 = new ArrayList<String>(); // Create fifth array list
		nameList5.add("Mahindra");
		nameList5.add("Tata");
		nameList5.add("Ford");
		System.out.println("Create a fifth array list\n" + nameList5);
		nameList5.remove("Tata"); // Use remove(Object) method
		System.out.println("After deleting Tata at index 1 using remove(object) method\n" + nameList5);
		nameList5.remove(1); // Use remove(index) method
		System.out.println("After deleting Ford at index 1 using remove(index) method\n" + nameList5);
		ArrayList<String> nameList6 = new ArrayList<String>(); // Create sixth array list
		nameList6.add("Apple");
		nameList6.add("Mango");
		nameList6.add("Watermalon");
		System.out.println("Create a sixth array list\n" + nameList6);
		nameList5.addAll(nameList6);
		System.out.println("After adding sixth arraylist element into fifth arraylist\n" + nameList5);
		nameList5.removeAll(nameList6); // Use removeAll() method
		System.out.println("After deleting all sixth arraylist element from fifth arraylist using removeAll() method\n" + nameList5);
		System.out.println("");
		ArrayList<String> nameList7 = new ArrayList<String>(); // Create seventh array list
		nameList7.add("Samsung");
		nameList7.add("Nokia");
		nameList7.add("Vivo");
		System.out.println("Create a seventh array list\n" + nameList7);
		ArrayList<String> nameList8 = new ArrayList<String>(); // Create eighth array list
		nameList8.add("Samsung");
		nameList8.add("JSP");
		nameList8.add("Servlet");
		System.out.println("Create a eighth array list\n" + nameList8);
		nameList7.retainAll(nameList8); // Use retainAll() method
		System.out.println("After using retainAll() method\n" + nameList7);
	}

}