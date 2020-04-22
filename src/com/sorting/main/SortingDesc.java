package com.sorting.main;

import java.util.ArrayList;
import java.util.Collections;

import com.sorting.model.Employee;

public class SortingDesc {

	public static void main(String[] args) {
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee("Avni", "garg", 40000));
		employeeList.add(new Employee("Ankita", "garg", 20000));
		employeeList.add(new Employee("Akarsh", "garg", 60000));

		Collections.sort(employeeList);
		System.out.println(employeeList);
	}

}
