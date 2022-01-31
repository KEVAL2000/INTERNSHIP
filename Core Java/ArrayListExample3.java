package com.java.keval;

import java.util.*;

/**
* Practical : ArrayList method
* @author Keval Parmar
* @version 1.0 2022-01-29
*/
class Student {

	private int id;
	private String name;
	private int sem;

	public Student (int id, String name, int sem) {
		this.id = id;
		this.name = name;
		this.sem = sem;
	}

	public int getId () {
		return id;
	}

	public String getName () {
		return name;
	}

	public int getSem () {
		return sem;
	}

	public String toString () {
		return "[" + id + "  " + name + "  " + sem + "]";
	}

}

public class ArrayListExample3 {

	public static void main (String[] args) {
		ArrayList<Student> studentData = new ArrayList<Student>(); // Create first array list
		Student student1 = new Student(101, "Keval", 8);
		Student student2 = new Student(102, "Harsh", 8);
		Student student3 = new Student(103, "Mitul", 8);
		studentData.add(student1);
		studentData.add(student2);
		studentData.add(student3);
		System.out.println("Create a first arraylist");
		System.out.println("=====Student Detail=====");
		System.out.println("ID     Name     Semester");
		System.out.println("------------------------");
		for (Student student : studentData) { // Use for each loop to print all student detail
			System.out.println(student.getId() + "    " + student.getName() + "    " + student.getSem());
		}
		System.out.println("------------------------");
		ArrayList<Student> studentDataNew = new ArrayList<>(); // Create second array list
		studentDataNew.add(new Student(104, "Raj", 6));
		studentDataNew.add(new Student(105, "Montu", 7));
		studentDataNew.add(new Student(106, "Milan", 8));
		System.out.println("Create a second arraylist");
		System.out.println(studentDataNew);
	}

}