package com.java8.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ThenApplyExample {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> "Hello World");
		completableFuture = completableFuture.thenApply(s -> s + "World");
		System.out.println(completableFuture.get());

	}

}
