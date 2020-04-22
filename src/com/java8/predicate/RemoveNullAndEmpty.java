package com.java8.predicate;

import java.util.function.Predicate;

public class RemoveNullAndEmpty {

	public static void main(String[] args) {
		String[] names = {"Sunny", "", "Kiran", null,"", "Anushka"};
		Predicate<String> p1 = s -> s != null && !s.isEmpty();
		//Predicate<String> p2 = s -> !s.isEmpty();
		m1(p1,names);
	}

	private static void m1(Predicate<String> p1, String[] names) {
		for(String n :names)
		{
			if(p1.test(n))
				System.out.println(n);
		}
		
	}

}