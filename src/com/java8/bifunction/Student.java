package com.java8.bifunction;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class Student {
	
	String name;
	int rollNo;
	

	public Student(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getRollNo() {
		return rollNo;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public static void main(String[] args) {
		ArrayList<Student> studList = new ArrayList<Student>();
		BiFunction<String , Integer, Student> f = (name,rollNo) -> new Student(name,rollNo);
		studList.add(f.apply("Shiva", 20));
		for(Student s : studList) {
			System.out.println(s.name);
			System.out.println(s.rollNo);
		}
				
	}

}
