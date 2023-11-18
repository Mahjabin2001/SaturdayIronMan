package com.upskill.assignment_2;

public class Q9 {

	public static void main(String[] args) {

		String a = "Talen";
		String b = "Tech";
		swap(a, b);
	}

	public static void swap(String a ,String b) {

		System.out.println("Before swap String a: " + a);
		System.out.println("Before swap String b: " + b);
		String temp = a;
		a = b;
		b = temp;
		System.out.println("After swap String a = " + a);
		System.out.println("After swap String b = " + b);

	}
}
