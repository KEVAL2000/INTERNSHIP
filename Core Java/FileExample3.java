package com.java.keval;

import java.io.FileWriter;
import java.io.IOException;

/**
* Practical : Write into file
* @author Keval Parmar
* @version 1.0 2022-01-30
*/
public class FileExample3 {

	public static void main (String[] args) throws IOException {
		FileWriter newFile = null;
		try {
			newFile = new FileWriter("D:\\Keval.txt");
			newFile.write("My name is Keval Ashwinbhai Parmar"); // Use write() method
			System.out.println("Details are added successfully");
		} catch (IOException exception) {
			System.out.println("Something went wrong");
			exception.printStackTrace();
		} finally {
			newFile.close(); // Use close() method
		}
	}

}