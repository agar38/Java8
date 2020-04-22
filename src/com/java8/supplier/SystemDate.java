package com.java8.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class SystemDate {

	public static void main(String args[])
	{
		Supplier<Date> s = () -> new Date();
		System.out.println(s.get());
	}
}
