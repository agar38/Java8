package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample2 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Ajay");
		al.add("Vijay");
		al.add("Manish");
		al.add("Suresh");
		List<String> l = al.stream().filter(s -> s.length() > 5).collect(Collectors.toList());
		System.out.println(l);
		List<String> l2 = al.stream().filter(s -> s.length() > 5).map(s -> s.toUpperCase())
				.collect(Collectors.toList());
		System.out.println(l2);

	}

}
