package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;

public class Array_Hashmap_Hashset_HashTable {


	@SuppressWarnings("unused")
	public static void main(String[] args) {
	
	//array stores multiple data using index	
		
		int age = 22; //variable
		int[] ageIronMan = new int[] {25,32,37,21,27};//array
		
		//array index                [0] [1] [2] [3] [4]
		
		System.out.println("Students' age: " + ageIronMan[2]);
		System.out.println("Total students: " + ageIronMan.length);

		
		
	
		String[]nameIron = new String[] {"Mim", "Tanha", "Sumaiya"};
		
		System.out.println("Student name: " + nameIron[0]);
		System.out.println("Total students: " + nameIron.length);
		
	//Multi-dimension Array
		int[][]ageIronMan2D = {{25,32,37,21,27,32}, //[0][0] [0][1] [0][2] [0][3] [0][4]
				              {26,30,33,28}};         //[1][0] [1][1] [1][2] [1][3]
		
		
		System.out.println("Student age 2D: " + ageIronMan2D [1][2]);
		
		
		//Hashmap stores multiple data using key-value pair, implementation of Map interface
	
		HashMap < String, Integer> Student = new HashMap < String, Integer>();
		
		Student.put("Mim", 22);  //key,value
		Student.put("A", 23);
		Student.put("B", 24);
		
		System.out.println("HashMap Student Age: " + Student.get("B"));

		HashMap<String, String> Capital = new HashMap<String, String>();
		
		Capital.put("USA", "Washington" );
		Capital.put("BD", "Dhaka" );
		
		System.out.println("Hashmap Capital: "+ Capital.get("USA"));
		
		
		//HashSet stores unordered collection containing unique value, implementation of set interface, no duplicate
		
		HashSet<String> car = new HashSet<String>(); 
		
		car.add("Porsche");
		car.add("Mercedes");
		
		System.out.println("car :" + car);
		
		
		//HashTable store multiple data using key value pair
				//also is synchronized (only one thread can be modified)
		Hashtable<String, String> Region = new Hashtable<String, String>();
		Region.put("BD", "Asia");
		Region.put("USA", "America");
		System.out.println("Region :" + Region.get("BD"));
		
		}
		
		
	}

