package com.java8.supplier;

import java.util.function.Supplier;

public class RandomName {

	public static void main(String[] args) {
		Supplier<String> s = () -> {
			String[] names = {"Sunny","Bunny","Honey","Tinny"};
			int r = (int) (Math.random()*4);
			return names[r];
		};
		System.out.println(s.get());
	}

}
