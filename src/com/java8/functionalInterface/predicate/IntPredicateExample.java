package com.java8.functionalInterface.predicate;

import java.util.function.IntPredicate;

public class IntPredicateExample {

	public static void main(String[] args) {
		int[] x = { 0, 2, 4, 6, 8, 10 };
		IntPredicate p = i -> i % 2 == 0;
		for (int x1 : x)
			System.out.println(p.test(x1));

	}

}
