package com.upskill.assignment_2;

public class Q6 {

	public static void main(String[] args) {
		for (int n = 0; n <= 100; n++) { 
			if (isPrime((n))) {
			System.out.print(" | " + n);	
			}
			
		}
	}
		


	public static boolean isPrime(int n) {
       
		if (n < 2) {
            return false; //not prime
        }
		
		if (n == 2) {
            return true;  //prime
        }
		
	for (int i= 3; i < n ; i++)
			if (n%i ==0) {
				return false;   //not prime
			}
		return true; 
	}
	
}
