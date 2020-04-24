package com.java8.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

public class SupplyAsyncMethod {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletableFuture<String> result = CompletableFuture.supplyAsync(() -> "Hello World");
		CompletableFuture<String> result2 = CompletableFuture.supplyAsync(() -> "Hello World 2",
				Executors.newCachedThreadPool());
		System.out.println(result.get());
		System.out.println(result2.get());

	}

}
