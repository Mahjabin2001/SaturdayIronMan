package com.upskill.assignment_2;

public class Q8 {

	public static void main(String[] args) {
		int n = 7;
		long factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial = (factorial * i);
		}

		System.out.println("factorial of " + n + "is " + factorial);

	}

}
