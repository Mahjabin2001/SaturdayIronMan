package com.upskill.java_6;

public class MultithreadingRunnable implements Runnable{
	public void run() {
		try {
			System.out.println("Thread NUmber # " + Thread.currentThread().getId() + " is running");
		} catch (Exception e) {
			System.out.println("Exception is caught");
			e.printStackTrace();
		}
	}

}
