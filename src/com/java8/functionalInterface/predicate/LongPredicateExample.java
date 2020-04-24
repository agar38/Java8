package com.java8.functionalInterface.predicate;

import java.util.function.LongPredicate;

public class LongPredicateExample {

	public static void main(String[] args) {
		int[] x = { 0, 2, 4, 6, 8, 10 };
		LongPredicate p = i -> i % 2 == 0;
		for (int x1 : x)
			System.out.println(p.test(x1));

	}
}
