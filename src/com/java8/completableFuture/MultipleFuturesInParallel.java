package com.java8.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MultipleFuturesInParallel {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletableFuture<String> completableFuture1 = CompletableFuture.supplyAsync(() -> "Hello");

		CompletableFuture<String> completableFuture2 = CompletableFuture.supplyAsync(() -> "world");

		CompletableFuture<String> completableFuture3 = CompletableFuture.supplyAsync(() -> "!!");
		CompletableFuture<Void> result = CompletableFuture.allOf(completableFuture1, completableFuture2,
				completableFuture3);
		System.out.println(result.isDone());

		String result2 = Stream.of(completableFuture1, completableFuture2, completableFuture3)
				.map(CompletableFuture::join).collect(Collectors.joining(" "));
		System.out.println(result2);
	}

}
