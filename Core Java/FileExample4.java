package com.java.keval;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

/**
* Practical : Read data from file
* @author Keval Parmar
* @version 1.0 2022-01-30
*/
public class FileExample4 {

	public static void main (String[] args) {
		File newFile = null;
		Scanner input = null;
		try {
			newFile = new File("D:\\Keval.txt");
			input = new Scanner(newFile);
			while (input.hasNextLine()) {
				String fileData = input.nextLine();
				System.out.println(fileData);
			}
		} catch (FileNotFoundException exception) {
			System.out.println("Something went wrong");
			exception.printStackTrace();
		} finally {
			input.close(); // Use close() method
		}
	}

}