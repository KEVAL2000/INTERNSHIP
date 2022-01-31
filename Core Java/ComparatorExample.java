package com.java.keval;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
* Practical : Comparator Interface
* @author Keval Parmar
* @version 1.0 2022-01-30
*/
class EmployeeData {

	int id;
	String name;
	float salary;

	public EmployeeData (int id, String name, float salary) { // Create EmployeeData Constructor
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId () {
		return id;
	}

	public String getName () {
		return name;
	}

	public float getSalary () {
		return salary;
	}

}

class IdComparator implements Comparator<EmployeeData> { // Create IdComparator()

	@Override
	public int compare (EmployeeData o1, EmployeeData o2) { // Use compare(Object o1, Object o2) method
		if (o1.getId() == o2.getId()) {
			return 0;
		} else if (o1.getId() > o2.getId()) {
			return 1;
		} else {
			return -1;
		}
	}

}

class NameComparator implements Comparator<EmployeeData> { // Create NameComparator()

	@Override
	public int compare (EmployeeData o1, EmployeeData o2) { // Use compare(Object o1, Object o2) method
		return o1.getName().compareTo(o2.getName());
	}

}

class SalaryComparator implements Comparator<EmployeeData> { // Create SalaryComparator()

	@Override
	public int compare (EmployeeData o1, EmployeeData o2) { // Use compare(Object o1, Object o2) method
		if (o1.getSalary() == o2.getSalary()) {
			return 0;
		} else if (o1.getSalary() > o2.getSalary()) {
			return 1;
		} else {
			return -1;
		}
	}

}

public class ComparatorExample {

	public static void main (String[] args) {
		ArrayList<EmployeeData> newEmployee = new ArrayList<EmployeeData>(); // Create newEmployee array list
		EmployeeData employee1 = new EmployeeData(101, "Keval", 7500);
		EmployeeData employee2 = new EmployeeData(104, "James", 4500);
		EmployeeData employee3 = new EmployeeData(102, "Martin", 5000);
		EmployeeData employee4 = new EmployeeData(110, "Pintu", 3000);
		EmployeeData employee5 = new EmployeeData(108, "Montu", 1000);
		newEmployee.add(employee1);
		newEmployee.add(employee2);
		newEmployee.add(employee3);
		newEmployee.add(employee4);
		newEmployee.add(employee5);

		Collections.sort(newEmployee, new IdComparator()); // Sort by id
		System.out.println("Using IdComparator()");
		System.out.println("======Employee Details======");
		System.out.println("ID\tName\tSalary");
		System.out.println("----------------------------");
		for(EmployeeData employee : newEmployee) {
			System.out.println(employee.id + "\t" + employee.name + "\t" + employee.salary);
		}
		System.out.println("----------------------------");
		System.out.println("");

		Collections.sort(newEmployee, new NameComparator()); // Sort by name
		System.out.println("Using NameComparator()");
		System.out.println("======Employee Details======");
		System.out.println("ID\tName\tSalary");
		System.out.println("----------------------------");
		for(EmployeeData employee : newEmployee) {
			System.out.println(employee.id + "\t" + employee.name + "\t" + employee.salary);
		}
		System.out.println("----------------------------");
		System.out.println("");

		Collections.sort(newEmployee, new SalaryComparator()); // Sort by salary
		System.out.println("Using SalaryComparator()");
		System.out.println("======Employee Details======");
		System.out.println("ID\tName\tSalary");
		System.out.println("----------------------------");
		for(EmployeeData employee : newEmployee) {
			System.out.println(employee.id + "\t" + employee.name + "\t" + employee.salary);
		}
		System.out.println("----------------------------");
	}

}