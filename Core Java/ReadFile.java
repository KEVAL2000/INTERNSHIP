package com.java.keval;

import java.io.FileReader;
import java.io.IOException;

/**
* Practical 25:- Write a program to read data from a myTextFile file
* @author Keval Parmar
* @version 1.0 2022-01-28
*/
public class ReadFile {

	public static void main (String[] args) throws IOException {
		FileReader newFile = null;
		try {
			newFile = new FileReader("D:\\myTestFile.txt");
			int i;
			while ((i = newFile.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (IOException exception) {
			System.out.println("Something went wrong");
			exception.printStackTrace(); // Print exception if any
		} finally {
			newFile.close();
		}
	}

}