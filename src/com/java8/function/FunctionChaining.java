package com.java8.function;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionChaining {

	public static void main(String args[]) {
		Function<Integer, Integer> f1 = i -> i * i;
		Function<Integer, Integer> f2 = i -> i * i * i;
		System.out.println(f1.andThen(f2).apply(2));

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user name");
		String userName = sc.next();
		System.out.println("Enter password");
		String password = sc.next();
		sc.close();

		Function<String, String> f3 = s -> s.substring(0, 5);
		Function<String, String> f4 = s -> s.toLowerCase();
		System.out.println(f3.andThen(f4).apply(userName));
		if (f3.andThen(f4).apply(userName).equals("durga") && password.equalsIgnoreCase("Java")) {
			System.out.println("Valid user");
		} else {
			System.out.println("Invalid user");
		}
	}

}
