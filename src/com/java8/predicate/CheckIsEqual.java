package com.java8.predicate;

import java.util.function.Predicate;

public class CheckIsEqual {

	public static void main(String[] args) {
		Predicate<String> s = Predicate.isEqual("Avni");
		System.out.println(s.test("Avni"));
		System.out.println(s.test(new String("Avni")));
		String s1 = new String();
		s1 = "Avni";
		String s2 = s1;
		System.out.println(s.test(new String(s2)));
		System.out.println(s.test(new String(s1)));
		if(s1==s2)
			System.out.println("Equal");
	}

}
