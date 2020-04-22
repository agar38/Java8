package com.java8.predicate;

import java.util.function.Predicate;

public class SEAllowedInPub {

	public String name;
	public int age;
	public boolean isHavingGf;

	public SEAllowedInPub(String name, int age, boolean isHavingGf) {
		this.name = name;
		this.age = age;
		this.isHavingGf = isHavingGf;
	}

	public static class Test {
		public static void main(String[] args) {
			SEAllowedInPub[] candidates = { new SEAllowedInPub("Anil", 23, Boolean.FALSE),
					new SEAllowedInPub("Ashok", 20, Boolean.TRUE), new SEAllowedInPub("Raju", 18, Boolean.TRUE) };
			Predicate<SEAllowedInPub> p = s -> s.age > 18 && s.isHavingGf;
			for (SEAllowedInPub candidate : candidates)
				System.out.println(p.test(candidate));

		}
	}

}
