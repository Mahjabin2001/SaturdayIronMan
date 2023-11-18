package com.upskill.java_2;

public class Loops {

	/*
	Types of loops 
	    1. For loop 
	    2. While loop
	    3.Do while loop 
	    4.Infinite loop
	 */

	public static void main(String[] args) {
		//practiceForLoop();
		//practiceWhileLoop();
		//practiceDoWhile();
		//practiceInfiniteLoop();
		practiceNested();
	}

	public static void practiceForLoop() { // For loop - repeat again and again up to upper limit
		int i; // Initialize the variable
		for (i = 1; i <= 10; i++) { // setting lower limit, upper limit, increment or decrement
			System.out.println("For loops num = " + i); // statement
		}
	}

	public static void practiceWhileLoop() { // repeat again and again up to condition
		int i = 1; // initialize variable
		while (i <= 10) { // setting condition
			System.out.println("while loop num = " + i); // statement
			i++; // increment or decrement
		}
	}

	public static void practiceDoWhile() { // do action then match condition
		int i = 1;// initialize variable
		do {
			System.out.println("Do while loop num " + i); // statement
			i++; // increment or decrement
		} while (i <= 10);// checking condition
	}

	public static void practiceInfiniteLoop() { // never ending
		int i;// initialize the variable
		for (i = 1;; i++) { // setting no upper limit
			System.out.println("infinite loop num " + i); // statement
		}
	}

	public static void practiceNested() { // nested loop - loop inside another loop
		int i; // initialize i for loop 1
		int j;// initialize i for loop 2

		for (i = 1; i <= 10; i++) { // first loop for i
			for (j = 1; j <= 10; j++) { // second for loop 2
				int multiplicationT = i * j;
				System.out.print(multiplicationT + "|"); // statement for loop 2
			}
			System.out.println(" -> "); // statement for loop 1
		}

	}

}

