package com.upskill.java_2;

public class IfElseStatement {

	public static void main(String[] args) {

		int age = 13;

		if (age <= 13) {
			if (age <= 0) {
				System.out.println("Invalid");
			} else
				System.out.println("You are children");

		}
		
		else if (age > 13 && age < 18) {

			System.out.println("You are teen");

		} else if (age >= 60) {

			if (age >= 100) {
				System.out.println("You are champ"); // nested

			} else
				System.out.println("You are senior");
		} else {
			System.out.println("You are adult"); // if(condition) {print};
													// else if
													// else (statement){print};
		}

	}

}
