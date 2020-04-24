package com.java8.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;

public class RunAsyncExample {

	public static void main(String[] args) {
		CompletableFuture.runAsync(() -> System.out.println("My task 1 is completed"));
		CompletableFuture.runAsync(() -> {
			System.out.println("My task2 is completed");
		}, Executors.newFixedThreadPool(2));

	}

}
