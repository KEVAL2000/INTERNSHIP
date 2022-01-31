package com.java.keval;

import java.util.ArrayList;
import java.util.Collections;

/**
* Practical : Comparable Interface
* @author Keval Parmar
* @version 1.0 2022-01-31
*/
class StudentData implements Comparable<StudentData> {

	int id;
	String name;
	int birthYear;

	public StudentData (int id, String name, int birthYear) {
		this.id = id;
		this.name = name;
		this.birthYear = birthYear;
	}

	public int getId () {
		return id;
	}

	public String getName () {
		return name;
	}

	public int birthYear () {
		return birthYear;
	}

	public int compareTo (StudentData student) {
		if (id == student.id) {
			return 0;
		} else if (id > student.id) {
			return 1;
		} else {
			return 0;
		}
	}

}

public class ComparableExample {

	public static void main (String[] args) {
		ArrayList<StudentData> nameList = new ArrayList<StudentData>();
		StudentData student1 = new StudentData(105, "Keval", 2000);
		StudentData student2 = new StudentData(101, "James", 2011);
		StudentData student3 = new StudentData(110, "Martin", 2001);
		StudentData student4 = new StudentData(107, "Raj", 2005);
		StudentData student5 = new StudentData(104, "Dhaval", 1997);
		nameList.add(student1);
		nameList.add(student2);
		nameList.add(student3);
		nameList.add(student4);
		nameList.add(student5);
		Collections.sort(nameList);
		System.out.println("======Student Detail======");
		System.out.println("ID\tName\tBirth Year");
		System.out.println("--------------------------");
		for(StudentData student : nameList) {
			System.out.println(student.id + "\t" + student.name + "\t" + student.birthYear);
		}
	}

}