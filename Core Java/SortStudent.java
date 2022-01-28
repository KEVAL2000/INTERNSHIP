package com.java.keval;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
* Practical 23:- Write a program to demonstrate comparable and comparator interface
* @author Keval Parmar
* @version 1.0 2022-01-28
*/
public class SortStudent {

	public static void main (String[] args) {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student(55, "Keval", 95));
		studentList.add(new Student(45, "James", 55));
		studentList.add(new Student(75, "Martin", 60));
		studentList.add(new Student(80, "Sunny", 80));
		studentList.add(new Student(52, "Kajal", 50));
		studentList.add(new Student(68, "Montu", 100));

		System.out.println("Before sorting list");
		System.out.println(studentList);

		Collections.sort(studentList);

		// Sorted by natural order of student name, as provide by compareTo method
		System.out.println("Sorting list by name");
		System.out.println(studentList);

		Collections.sort(studentList, new IdComparator());

		// Sorted by id of student, as provide by IdComparator
		System.out.println("Sorting list by id");
		System.out.println(studentList);

		Collections.sort(studentList, new MarkComparator());

		// Sorted by mark of student, as provide by MarkComparator
		System.out.println("Sorting list by mark");
		System.out.println(studentList);

	}

}

class Student implements Comparable<Student> {

	private int id;
	private String name;
	private int mark;

	public Student (int id, String name, int mark) {
		this.id = id;
		this.name = name;
		this.mark = mark;
	}

	@Override
	public int compareTo (Student o) {
		return name.compareTo(o.name);
	}

	public String toString () {
		return "\n[ Id = " + id + " , Name = " + name + " , Mark = " + mark + " ]";
	}

	public int getId () {
		return id;
	}

	public void setId (int id) {
		this.id = id;
	}

	public String getName () {
		return name;
	}

	public void setName (String name) {
		this.name = name;
	}

	public int getMark () {
		return mark;
	}

	public void setMark (int mark) {
		this.mark = mark;
	}

}

class IdComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if (o1.getId() < o2.getId()) {
			return -1;
		} else if (o1.getId() > o2.getId()) {
			return 1;
		} else {
			return 0;
		}
	}

}

class MarkComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if (o1.getMark() < o2.getMark()) {
			return -1;
		} else if (o1.getMark() > o2.getMark()) {
			return 1;
		} else {
			return 0;
		}
	}

}