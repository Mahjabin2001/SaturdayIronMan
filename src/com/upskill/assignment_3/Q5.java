package com.upskill.assignment_3;

public class Q5 {

	public static void main(String[] args) {
		  String s = "A quick brown fox jumps over the lazy dog  ";
		s = s.toLowerCase();
	        int vowel = 0;
	        int consonent = 0;
	        int space = 0;
	        int tabs = 0;
	        int digit =0 ;
	        
	        
	       
	        
	        for (int i=0; i<s.length();i++) {
	        	if (s.charAt(i)=='a' || s.charAt(i)== 'e' || s.charAt(i)== 'i' || s.charAt(i)== 'o' || s.charAt(i)== 'u') {
	        		vowel++;
	        	} else if (s.charAt(i)==' ')	{
	        		space++;
	        	}else if (s.charAt(i)>='0' && s.charAt(i) <= '9')	{
	        		digit++;
	        	}else if (s.charAt(i)=='\t') {
	        		tabs++;
	        	}
	        	else {
	        		consonent++;
	        	}
	        	
	        }
	        System.out.println("Number of vowel is " + vowel);
	        System.out.println("Number of consonent is " + consonent);
	        System.out.println("Number of black space is " + space);
	        System.out.println("Number of tab is " + tabs);
	        System.out.println("Number of digit is " + digit);
	}

	
	
	
	
}
