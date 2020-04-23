package com.java8.bifunction;

import java.util.function.BiFunction;

class Employee {
	int eno;
	String name;
	double dailyWage;

	public Employee(int eno, String name, double dailyWage) {
		super();
		this.eno = eno;
		this.name = name;
		this.dailyWage = dailyWage;
	}

}

class TimeSheet {
	int eno;
	int numDays;

	public TimeSheet(int eno, int numDays) {
		super();
		this.eno = eno;
		this.numDays = numDays;
	}

}

public class TestEmployee {
	public static void main(String[] args) {
		Employee e = new Employee(101, "Durga", 1000);
		TimeSheet t = new TimeSheet(101, 30);
		BiFunction<Employee, TimeSheet, Double> monthlySalary = (emp, time) -> emp.dailyWage * time.numDays;
		System.out.println("Monthly salary:" + monthlySalary.apply(e, t));

	}

}
