package com.java8.streams;

import java.util.ArrayList;

public class ToArrayMethod {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(25);
		al.add(31);
		al.add(50);
		Integer[] array = al.stream().toArray(Integer[]::new);
		for (Integer x : array)
			System.out.println(x);
	}

}
