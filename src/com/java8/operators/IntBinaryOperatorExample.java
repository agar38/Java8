package com.java8.operators;

import java.util.function.IntBinaryOperator;

public class IntBinaryOperatorExample {

	public static void main(String[] args) {
		IntBinaryOperator o = (a,b) -> a+b;
		System.out.println(o.applyAsInt(10, 20));

	}

}
