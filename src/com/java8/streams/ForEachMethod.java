package com.java8.streams;

import java.util.ArrayList;

public class ForEachMethod {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("ram");
		al.add("Shyam");
		al.add("Bam");

		al.stream().forEach(s -> System.out.println(s));
		al.stream().forEach(System.out::println);
	}

}
