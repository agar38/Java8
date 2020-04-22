package com.java8.function;

import java.util.function.Function;

public class Square {

	public static void main(String[] args) {
		Function<Integer,Integer> f = s -> s*s;
		System.out.println(f.apply(20));

	}

}
