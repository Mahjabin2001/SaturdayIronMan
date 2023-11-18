package com.upskill.assignment_4;

import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {

		//reverse();
		rev();

	}

	public static void reverse() {

		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first string: ");
		StringBuilder rev = new StringBuilder(s.nextLine());
		rev.reverse();

		System.out.println("The reverse string is: " + rev);

	}
	
	
	
	public static void rev(){
		
		
		
		
		Scanner r = new Scanner(System.in);	
		System.out.println("Enter a string: ");
		String s = r.nextLine();
		String rev = "" ;
		
		
		
		for (int i = s.length()-1; i>=0; i-- ) { //hi
			rev = rev + s.charAt(i);
		}
		
		System.out.println(rev);
		
		

	}

}
