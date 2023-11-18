package com.upskill.assignment_4;

import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		
		int n = scan.nextInt();
		int[] arr = new int[n];
	
	System.out.println("Enter the elements one by one");
	for (int i =0; i< arr.length;i++) {
		arr[i]= scan.nextInt();
		
	}
		
		int count = 0;
		for (int i=0;i<arr.length;i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
		}
		System.out.println("The count of duplicates are: "+ count);
	}
	
	

		
	}


