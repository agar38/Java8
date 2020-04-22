package com.java8.function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;;


public class StudentGrade {

	int marks;

	public StudentGrade(int marks, String name) {
		this.marks = marks;
		this.name = name;
	}

	@Override
	public String toString() {
		return "StudentGrade [marks=" + marks + ", name=" + name + "]";
	}

	String name;

	public static void main(String[] args) {
		ArrayList<StudentGrade> studentList = new ArrayList<>();
		studentList.add(new StudentGrade(100, "Bunny"));
		studentList.add(new StudentGrade(65, "Sunny"));
		studentList.add(new StudentGrade(85, "Chinni"));
		studentList.add(new StudentGrade(45, "Tinni"));
		studentList.add(new StudentGrade(25, "Pinni"));

		Function<StudentGrade, String> f = s -> {
			int marks = s.marks;
			if (marks >= 75)
				return "Distinction";
			else if (marks >= 60 && marks < 75)
				return "First";
			else if (marks >= 50 && marks < 60)
				return "Second";
			else if (marks >= 35 && marks < 50)
				return "Third";
			else
				return "Fail";
		};

		Predicate<StudentGrade> p = s -> s.marks>=60;
				
		for (StudentGrade student : studentList) {
			if(p.test(student)) {
			System.out.println(student.name);
			System.out.println(student.marks);
			System.out.println(f.apply(student));
			}
		}
	}

}
