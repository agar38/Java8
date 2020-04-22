package com.java8.function;

import java.util.function.Function;

public class RemoveSpaces {

	public static void main(String[] args) {
		Function<String,String> f = s -> s.replaceAll(" ", "");
		System.out.println(f.apply(" Durga Soft "));

		Function<String,Integer> f2 = s -> s.length() - s.replaceAll(" ", "").length();
		
		System.out.println(f2.apply(" Durga  Soft "));
	}
		
}
