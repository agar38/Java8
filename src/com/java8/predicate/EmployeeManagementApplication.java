package com.java8.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

import com.java8.predicate.model.Employee;

public class EmployeeManagementApplication {

	public static void main(String[] args) {

		ArrayList<Employee> employeeList = new ArrayList<>();
		Employee e1 = new Employee("Durga", "CEO", 30000, "Hyderabad");
		Employee e2 = new Employee("Neetu", "CFO", 28000, "Hyderabad");
		Employee e3 = new Employee("Neelu", "Developer", 28000, "Hyderabad");
		Employee e4 = new Employee("Rakesh", "Developer", 10000, "Bangalore");
		Employee e5 = new Employee("Rajesh", "Sr. Developer", 12000, "Hyderabad");
		Employee e6 = new Employee("Teena", "Architect", 15000, "Hyderabad");
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);
		employeeList.add(e5);
		employeeList.add(e6);
		//System.out.println(employeeList);
		
		Predicate<Employee> p = emp -> emp.getDesignation().equalsIgnoreCase("Developer");
		Predicate<Employee> p2 = emp -> emp.getCity().equalsIgnoreCase("Hyderabad");
		display(p, employeeList);
		System.out.println("All employees of Hyderabad");
		display(p2, employeeList);
		System.out.println("All developer of bangalore");
		display(p.and(p2), employeeList);
		
	}

	public static void display(Predicate<Employee> p, ArrayList<Employee> empList)
	{
		for(Employee e : empList)
		{
			if(p.test(e))
				System.out.println(e);
		}
	}
}