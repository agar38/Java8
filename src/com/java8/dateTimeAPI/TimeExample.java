package com.java8.dateTimeAPI;

import java.time.*;

public class TimeExample {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		int dd = date.getDayOfMonth();
		int mm = date.getMonthValue();
		int yyyy = date.getYear();

		System.out.println(dd + ".." + mm + ".." + yyyy);
		LocalTime time = LocalTime.now();
		System.out.println(time);
	}

}
