package com.sorting.model;

public class Employee implements Comparable<Employee> {

	public String firstName;
	public String lastName;
	public long salary;

	public Employee(String firstName, String lastName, long salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee obj1) {
		return (obj1.salary < this.salary) ? -1 : (obj1.salary > this.salary) ? 1 : 0;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + "]";
	}

}
