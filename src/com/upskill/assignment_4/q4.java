package com.upskill.assignment_4;

import java.util.Scanner;

public class q4 {

	public static void main(String[] args) {

		leapYear();
		leapYear();
	

	}

	public static void leapYear() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year to check for leap year");
		int n = sc.nextInt();

		if (n % 4 == 0 && n % 100 == 0 && n % 400 == 0) {
			System.out.println(n + " is a leap year");

		} else {
			System.out.println(n + " is not a leap year");
		}
	}

}
