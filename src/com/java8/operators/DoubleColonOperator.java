package com.java8.operators;

public class DoubleColonOperator {

	public void m1() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child thread");
		}
	}

	public static void main(String[] args) {
		DoubleColonOperator t = new DoubleColonOperator();
		Runnable r = t::m1; // child thread is responsible for running run method which is m1 in this case
		Thread t1 = new Thread(r);
		t1.start(); // responsible for executing below code
		for (int i = 0; i < 10; i++)
			System.out.println("Main thread");
	}

}
