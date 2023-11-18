package com.upskill.assignment_2;

public class Q2 {

	public static void main(String[] args) {
		Grades();

	}

	public static void Grades() {
		int grade = 55;
		if (grade >= 90) {
			System.out.println("Your grade is A");
		} else if (grade >= 80 && grade <= 89) {
			System.out.println("Your grade is B");
		} else if (grade >= 70 && grade <= 79) {
			System.out.println("Your grade is C");
		} else if (grade >= 60 && grade <= 69) {
			System.out.println("Your grade is D");
		} else {
			System.out.println("You have a failing grade");

		}

	}
}
