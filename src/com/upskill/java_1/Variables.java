package com.upskill.java_1;

public class Variables {

	
	// Variables in Java
	
	// Instances OR global variable - variables declared in class level, outside method
	
	//local variable - variables declared in methods
	
	//static variable - variables belong to class and don't required creating object
	
	//method variable - variables used as method parameter
	
	
	
	public String country = "USA";
	
	public static String region = "North America";
	
	public static void main(String[] args) {
		
		String city = "New York";
		
		String police = "NYPD";		//static
		
		System.out.println(city);
		System.out.println(police);
		System.out.println(region);
		
		
		nj("Essex");
		pa("Bensalem");
		
		
		Variables obj = new Variables();
		System.out.println(obj.country);   //create object because non static
	}

	
	public static void nj(String county) { 
		
		String city = "Bloomfield";        //local 
		
		String police = "BPD";
		System.out.println(city);
		System.out.println(police);
		System.out.println(county);
		
		
		
	}
	
public static void pa(String county) {
		
		String city = "Philly";
		
		String police = "PPD";
		System.out.println(city);
		System.out.println(police);
		System.out.println(county);
		
	}
	
	
}
