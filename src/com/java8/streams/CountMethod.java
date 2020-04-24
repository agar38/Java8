package com.java8.streams;

import java.util.ArrayList;

public class CountMethod {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Ajay");
		al.add("Vijay");
		al.add("Manish");
		al.add("Suresh");
		long num = al.stream().filter(s ->s.length()>5).count();
		System.out.println(num);
	}

}
