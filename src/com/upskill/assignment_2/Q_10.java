package com.upskill.assignment_2;

import java.util.Scanner;

public class Q_10 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner F = new Scanner(System.in);
		System.out.println("Enter the temperature in Farenheit: ");
		double far = ((F.nextDouble() - 32) * 5) / 9;
		System.out.println("The temperature in celsius is: " + far);

	}

}
