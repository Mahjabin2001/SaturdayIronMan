package com.upskill.assignment_4;

import java.util.Arrays;
import java.util.Scanner;

public class q5 {

	public static void main(String[] args) {
		anagram();
		anagram();
		anagram();

	}

	public static boolean  anagram() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first word");
		String str1 = sc.next();
		System.out.println("Enter the second word");
		String str2 = sc.next();

		char[] charArr = str1.toCharArray();
		char[] charArr2 = str2.toCharArray();

		int n = charArr.length;
		int n2 = charArr2.length;

		if (n != n2) {
			System.out.println("The strings are not anagram");
			
		}

		Arrays.sort(charArr);
		Arrays.sort(charArr2);

		for (int i = 0; i < n; i++) {
			if (charArr[i] != charArr2[i]) {
				System.out.println("The strings are not anagram");
				return false;

			}

		}
		System.out.println("The string are anagram");
		return true;
	}
}
