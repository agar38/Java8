package com.java8.functionaInteface.consumer;

import java.util.function.IntConsumer;

public class PrimitiveFunctionConsumerExample {

	public static void main(String[] args) {
		IntConsumer c = i -> System.out.println(i*i);
		c.accept(10);

	}

}
