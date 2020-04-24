package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortedMethod {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(25);
		al.add(31);
		al.add(50);
		List<Integer> l = al.stream().sorted((i1, i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(l);
		List<Integer> l2 = al.stream().sorted().collect(Collectors.toList());
		System.out.println(l2);

	}

}
