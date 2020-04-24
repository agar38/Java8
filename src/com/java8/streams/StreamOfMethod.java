package com.java8.streams;

import java.util.stream.Stream;

public class StreamOfMethod {

	public static void main(String[] args) {
		// Double[] d = {10.0,10.1,10.2,10.3,10.4};
		Stream<Double> d = Stream.of(10.0, 10.1, 10.2, 10.3, 10.4);
		d.forEach(System.out::println);
		Double[] d2 = { 10.0, 10.1, 10.2, 10.3, 10.4 };
		Stream<Double> d3 = Stream.of(d2);
		d3.forEach(System.out::println);
	}

}
