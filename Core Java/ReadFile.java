package com.java.keval;

import java.io.FileReader;
import java.io.IOException;

/**
* Practical 25:- Write a program to read data from a myTextFile file
* @author Keval Parmar
* @version 1.0 2022-01-28
*/
public class ReadFile {

	public static void main (String[] args) {
		try {
			FileReader file = new FileReader("D:\\myTestFile.txt");
			int i;
			while ((i = file.read()) != -1) {
				System.out.print((char) i);
			}
			file.close();
		} catch (IOException e) {
			System.out.println("Something went wrong");
			e.printStackTrace(); // Print exception if any
		}
	}

}