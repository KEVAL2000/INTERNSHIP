package com.java.keval;

import java.io.File;
import java.io.IOException;

/**
* Practical 24:- Write a program to create a text file (The file name is "myTestFile")
* and add your personal details to the test file
* @author Keval Parmar
* @version 1.0 2022-01-28
*/
public class CreateFile {

	public static void main (String[] args) {
		File file = new File("D:\\myTestFile.txt"); // Create file object
		boolean result;
		try {
			result = file.createNewFile(); // Create a new file
			if (result) { // Test condition
				System.out.println("File created at Location : " + "\" " + file.getCanonicalPath() + " \""); // Return path
			} else {
				System.out.println("File already exists! at Location : " + "\" " + file.getCanonicalPath() + " \""); // Return path
			}
		} catch (IOException e) {
			e.printStackTrace(); // Print exception if any
		}
	}

}