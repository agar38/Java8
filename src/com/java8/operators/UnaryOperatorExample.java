package com.java8.operators;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

	public static void main(String[] args) {
		UnaryOperator<Integer> u = i -> i*i;
		System.out.println(u.apply(10));
		

	}

}
