package com.upskill.assignment_2;

public class Q7 {

	public static void main(String[] args) {

		swap(25, 30);

	}

	public static void swap(int a, int b) {

		System.out.println("Before swap a: " + a);
		System.out.println("Before swap b: " + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After swap a = " + a);
		System.out.println("After swap b = " + b);

	}
}
