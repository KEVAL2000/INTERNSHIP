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
		FileWriter newFile = null;
		try {
			newFile = new FileWriter("D:\\myTestFile.txt");
			newFile.write("First Name : Keval"); // Add detail into file
			newFile.write("\nMiddle Name : Ashwinbhai");
			newFile.write("\nLast Name : Parmar");
			newFile.write("\nEnrollment Number : 180160116055");
			System.out.println("Details are added successfully!");
		} catch (IOException exception) {
			System.out.println("Something went wrong");
			exception.printStackTrace(); // Print exception if any
		} finally {
			newFile.close(); // Close file
		}
	}

}