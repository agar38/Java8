package com.java8.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureCompletedFuture {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletableFuture<String> completableFuture = CompletableFuture.completedFuture("Hello World!");
		String result = completableFuture.get();
		System.out.println(result);
	}

}
