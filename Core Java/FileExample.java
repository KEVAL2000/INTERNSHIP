package com.java.keval;

import java.io.File;
import java.io.IOException;

/**
* Practical : Create file
* @author Keval Parmar
* @version 1.0 2022-01-30
*/
public class FileExample {

	public static void main (String[] args) {
		try {
			File newFile = new File("D:\\Keval.txt"); // Create newFile object of File class
			if (newFile.createNewFile()) { // Use createNewFile() method
				System.out.println("File " + newFile.getName() + " is created successfully"); // Use getName() method
			} else {
				System.out.println("File is already exist in the directory");
			}
		} catch (IOException exception) {
			System.out.println("Something went wrong");
			exception.printStackTrace();
		}
	}

}