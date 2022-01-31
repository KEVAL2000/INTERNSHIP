package com.java.keval;

import java.io.File;

/**
* Practical : Delete file
* @author Keval Parmar
* @version 1.0 2022-01-30
*/
public class FileExample5 {

	public static void main (String[] args) {
		File newFile = new File("D:\\Keval.txt");
		if (newFile.delete()) { // Use delete() method
			System.out.println(newFile.getName() + " file is deleted successfully"); // Use getName() method
		} else {
			System.out.println("Something went wrong");
		}
	}

}