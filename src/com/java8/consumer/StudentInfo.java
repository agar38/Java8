package com.java8.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentInfo {

	public static void main(String[] args) {
	
		ArrayList<Student> studentList = new ArrayList<>();
		studentList.add(new Student("Sunny", 90));
		studentList.add(new Student("Bunny", 80));
		studentList.add(new Student("Tinny", 35));
		studentList.add(new Student("Minny", 75));
		
		Predicate<Student> p = s-> s.getMarks() >=60;
		Function<Student, String> f = s -> {
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
		Consumer<Student> c = s->
		{
			System.out.println(s.name);
			System.out.println(s.marks);
			System.out.println(f.apply(s));
		};
		
		for(Student s : studentList)
		{
			if(p.test(s))
			{
				c.accept(s);
			}
		}
	}

}
