package com.java8.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ErrorHandling {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		String name = null;
		CompletableFuture<String> completableFuture1 = CompletableFuture.supplyAsync(() -> {
			if (name == null)
				throw new RuntimeException("Computation error");
			return "Hello" + name;
		}).handle((s, t) -> s != null ? s : "Hello Stranger");

		System.out.println(completableFuture1.get());
	}

}
