package com.upskill.assignment_2;

public class Q3 {

	public static void main(String[] args) {
		if (function1() > function2()) {
			System.out.println("Function 1 is bigger");
		} else {
			System.out.println("Function 2 is bigger");
		}
	}

	public static int function1() {
		return 30;
	}

	public static int function2() {
		return 50;
	}

}
