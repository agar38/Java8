package com.java8.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ThenAcceptExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> "Hello World");
		completableFuture.thenAccept(s -> System.out.println("Complete" + s));
		completableFuture.get();

	}

}
