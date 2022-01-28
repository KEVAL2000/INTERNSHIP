package com.java.keval;

import java.io.FileWriter;
import java.io.IOException;

/**
* Practical 24:- Write a program to create a text file (The file name is "myTestFile")
* and add your personal details to the test file
* @author Keval Parmar
* @version 1.0 2022-01-28
*/
public class AddFile {

	public static void main (String[] args) throws IOException {
		FileWriter file = null;
		try {
			file = new FileWriter("D:\\myTestFile.txt");
			file.write("First Name : Keval"); // Add detail into file
			file.write("\nMiddle Name : Ashwinbhai");
			file.write("\nLast Name : Parmar");
			file.write("\nEnrollment Number : 180160116055");
			System.out.println("Details are added successfully!");
		} catch (IOException e) {
			System.out.println("Something went wrong");
			e.printStackTrace(); // Print exception if any
		} finally {
			file.close(); // Close file
		}
	}

}