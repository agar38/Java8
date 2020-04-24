package com.java8.functionaInteface.consumer;

import java.util.function.ObjIntConsumer;

public class Employee {

	int salary;

	public Employee(int salary) {
		super();
		this.salary = salary;
	}

	static class ObjIntConsumerExample {

		public static void main(String[] args) {
			ObjIntConsumer<Employee> c = (e, d) -> e.salary = e.salary + d;
			Employee emp = new Employee(4000);
			c.accept(emp, 50);
			System.out.println(emp.salary);
		}

	}
}