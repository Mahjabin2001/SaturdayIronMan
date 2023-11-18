package com.upskill.java_6;

public class MultiThreading {

	/*
	 * MultiThreading is a java feature that allows concurrent execution of two or
	 * more parts of a program threads can be created by using two mechanism
	 * 
	 * 1. extending the thread class 2. implementing the runnable interface
	 */

	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i < n; i++) {
			MultithreadingThread obj = new MultithreadingThread();
			obj.start();
			
			Thread obj2 = new Thread(new MultithreadingRunnable());
			obj2.start();
		}
	}

}
