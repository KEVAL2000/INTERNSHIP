package com.java.keval;

import java.io.File;

/**
* Practical : Get info of file
* @author Keval Parmar
* @version 1.0 2022-01-30
*/
public class FileExample2 {

	public static void main (String[] args) {
		File newFile = new File("D:\\Keval.txt");
		if (newFile.exists()) { // Use exists() method
			System.out.println("File Information :");
			System.out.println("Name : " + newFile.getName()); // Use getName() method
			System.out.println("Absolute Path : " + newFile.getAbsolutePath()); // Use getAbsolutePath() method
			System.out.println("is Writable ? : " + newFile.canWrite()); // Use canWrite() method
			System.out.println("is Readable ? : " + newFile.canRead()); // Use canRead() method
			System.out.println("Size : " + newFile.length()); // Use length() method
		} else {
			System.out.println("The file does not exist");
		}
	}

}