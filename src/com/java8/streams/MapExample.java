package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(25);
		al.add(31);
		al.add(50);
		List<Integer> l= al.stream().map(i -> i*2).collect(Collectors.toList());
		System.out.println(l);

	}

}
