package com.java8.supplier;

import java.util.function.Supplier;

public class RandomPassword {

	public static void main(String[] args) {
		Supplier<String> s = () -> {
			String password = "";
			Supplier<Integer> s1 = () -> (int) (Math.random() * 10);
			String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";
			Supplier<Character> c = () -> symbols.charAt((int) (Math.random() * 29));
			for (int i = 1; i <= 8; i++) {
				if (i % 2 == 0)
					password = password + s1.get();
				else
					password = password + c.get();
			}
			return password;
		};
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
	}

}
