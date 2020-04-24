package com.java8.functionaInteface.function;

import java.util.function.ToIntFunction;

public class ToIntPrimitiveFunctionExample {

	public static void main(String[] args) {
		ToIntFunction<String> f = s-> s.length();
		System.out.println(f.applyAsInt("Durga"));
	}

}
