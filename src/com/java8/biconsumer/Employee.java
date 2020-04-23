package com.java8.biconsumer;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class Employee {
	String name;
	double salary;

	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<Employee>();
		BiFunction<String, Double, Employee> f = (name, salary) -> new Employee(name, salary);
		empList.add(f.apply("Durga", 10000.0));
		empList.add(f.apply("Soft", 20000.0));
		BiConsumer<Employee, Double> c = (employee, increment) -> employee.salary = employee.salary + increment;
		for (Employee e : empList)
			c.accept(e, 500.0);
		for(Employee e : empList)
			System.out.println("New salary is :" + e.salary);
	}

}
