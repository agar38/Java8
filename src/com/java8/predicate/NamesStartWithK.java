package com.java8.predicate;

import java.util.function.Predicate;

public class NamesStartWithK {

	public static void main(String[] args) {
		String[] names = {"Sunny", "Kajal", "Kiran", "Kohli", "Anushka"};
		Predicate<String> p1 = s -> s.charAt(0)== 'K';
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
