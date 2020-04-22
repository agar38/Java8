package com.java8.function;

import java.util.ArrayList;

import com.java8.function.model.Employee;
import java.util.function.Function;
import java.util.function.Predicate;

public class TotalSalary {

	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("sunny", 1000));
		empList.add(new Employee("bynny", 10000));
		empList.add(new Employee("tinny", 5000));

		Function<ArrayList<Employee>, Double> f = l -> {
			double tot = 0;
			for (Employee emp : l) {
				tot += emp.getSalary();
			}
			return tot;

		};

		System.out.println(f.apply(empList));

		Predicate<Employee> p = e -> e.getSalary() < 3000;
		Function<Employee, Employee> f2 = e -> {
			e.setSalary(e.getSalary() + 477);
			return e;
		};
		ArrayList<Employee> newEmpList = new ArrayList<Employee>();
		for (Employee e : empList) {
			if (p.test(e)) {
				newEmpList.add(f2.apply(e));
			}
		}
		System.out.println(newEmpList);
	}

}
