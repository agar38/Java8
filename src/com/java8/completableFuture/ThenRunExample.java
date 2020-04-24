package com.java8.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ThenRunExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> "Hello World");
		completableFuture.thenRun(() -> System.out.println("Complete"));
		completableFuture.get();
	}

}
