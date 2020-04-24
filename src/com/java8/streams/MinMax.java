package com.java8.streams;

import java.util.ArrayList;

public class MinMax {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(25);
		al.add(31);
		al.add(50);
		System.out.println(al);
		Integer min = al.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println(min);
		Integer max = al.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println(max);

	}

}
