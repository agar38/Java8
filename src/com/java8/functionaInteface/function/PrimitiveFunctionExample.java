package com.java8.functionaInteface.function;

import java.util.function.IntFunction;

public class PrimitiveFunctionExample {

	public static void main(String[] args) {
		IntFunction<Integer> f =i-> i*i;
		System.out.println(f.apply(5));

	}

}
