package com.java8.operators;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

	public static void main(String[] args) {
		BinaryOperator<String> f = (a,b) -> a+b; 
		System.out.println(f.apply("Durga", "Soft"));
		
	}

}
